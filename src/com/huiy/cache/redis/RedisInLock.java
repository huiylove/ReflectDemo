package com.huiy.cache.redis;

import java.util.Collections;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月27日
 * 分布式锁的实现
 */
public class RedisInLock {
	private static final String REDIS_NX_VAL = "NX";//NX 键不存在设值成功;XX 键存在设置成功
	private static final String REDIS_EX_VAL = "EX";//EX 键的过期时间为 second 秒;PX 键的过期时间为 millisecond 毫秒
	private static final String REDIS_LOCK_SUCCESS = "OK";
	private static String REDIS_KEY = "lock";

    final Jedis jedis =  new Jedis("127.0.0.1");
    
    private static final String LOCK_SUCCESS = "OK";
    private static final Long UNLOCK_SUCCESS = 1L;


	public static void main(String[] args) {
		RedisInLock set = new RedisInLock();
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
	

	/**
	 
	  * 加锁操作
	 
	  * @param key 锁标识
	 
	  * @param value 客户端标识
	 
	  * @param timeOut 过期时间
	 
	  */
	 
	 public Boolean lock(String key,String value,Long timeOut){
	 
	     String var1 = jedis.set(key,value,"NX","EX",timeOut);
	 
	     if(LOCK_SUCCESS.equals(var1)){
	 
	         return true;
	 
	     }
	 
	     return false;
	 
	 }
	 
	/**
	 
	  * 解锁操作
	 
	  * @param key 锁标识
	 
	  * @param value 客户端标识
	 
	  * @return
	 
	  */
	 
	 public  Boolean unLock(String key,String value){
	 
		 //luaScript 这个字符串是个lua脚本，代表的意思是如果根据key拿到的value跟传入的value相同就执行del，否则就返回0
	     String luaScript = "if redis.call(\"get\",KEYS[1]) == ARGV[1] then return redis.call(\"del\",KEYS[1]) else  return 0 end";
	 
	     //edis.eval(String,list,list);这个命令就是去执行lua脚本，KEYS的集合就是第二个参数，ARGV的集合就是第三参数【保证解锁的原子操作】
	     Object var2 = jedis.eval(luaScript,Collections.singletonList(key), Collections.singletonList(value));
	 
	     if (UNLOCK_SUCCESS == var2) {
	 
	         return true;
	 
	     }
	 
	     return false;
	 
	 }
	 
	 
	 /**
	 
	  * 重试机制
	  
	  * @param key 锁标识
	  
	  * @param value 客户端标识
	  
	  * @param timeOut 过期时间
	  
	  * @param retry 重试次数
	  
	  * @param sleepTime 重试间隔时间
	  
	  * @return
	  
	  */
	  
	 public Boolean lockRetry(String key,String value,Long timeOut,Integer retry,Long sleepTime){
	  
	     Boolean flag = false;
	  
	     try {
	  
	         for (int i=0;i<retry;i++){
	  
	             flag = lock(key,value,timeOut);
	  
	             if(flag){
	  
	                 break;
	  
	             }
	             Thread.sleep(sleepTime);
	         }
	  
	     }catch (Exception e){
	         e.printStackTrace();
	     }
	  
	     return flag;
	  
	 }
	
}
