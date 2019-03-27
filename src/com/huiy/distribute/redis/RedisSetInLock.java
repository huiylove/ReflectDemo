package com.huiy.distribute.redis;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月27日
 * 分布式锁的实现
 */
public class RedisSetInLock {
	private static String REDIS_NX_VAL = "NX";//NX 键不存在设值成功;XX 键存在设置成功
	private static String REDIS_EX_VAL = "EX";//EX 键的过期时间为 second 秒;PX 键的过期时间为 millisecond 毫秒
	private static String REDIS_LOCK_SUCCESS = "OK";
	private static String REDIS_KEY = "lock";

    final Jedis jedis =  new Jedis("127.0.0.1");

	public static void main(String[] args) {
		RedisSetInLock set = new RedisSetInLock();
		new Thread(()->{
			try {
				set.lock();
				Thread.sleep(5000);//执行任务时间
				set.unlock();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"t1").start();
		
		
		new Thread(()->{
			try {
				Thread.sleep(3000);
				set.lock();	
				Thread.sleep(1000);//执行任务时间
				set.unlock();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"t2").start();
		
	}
	
	
	public boolean lock(){
		if(REDIS_LOCK_SUCCESS.equals(jedis.set(REDIS_KEY,String.valueOf(Thread.currentThread().getId()),REDIS_NX_VAL, REDIS_EX_VAL,2))){
			return true;
//			System.out.println("当前时间："+System.currentTimeMillis()+"==线程"+Thread.currentThread().getName()+"==获得锁");
		}else{
//			System.out.println("当前时间："+System.currentTimeMillis()+"==线程"+Thread.currentThread().getName()+"==获取锁失败");
			return false;

		}
//		else{
//			System.out.println(Thread.currentThread().getId()+jedis.get(REDIS_KEY));
//
//		}
	}
	
	public boolean unlock(){
		if(String.valueOf(Thread.currentThread().getId()).equals(jedis.get(REDIS_KEY))){
			jedis.del(REDIS_KEY);
//			System.out.println(Thread.currentThread().getName()+"释放了锁");
			return true;
		}else{
//			System.out.println(Thread.currentThread().getName()+"无法释放锁");
			return false;
		}
	}
	
}
