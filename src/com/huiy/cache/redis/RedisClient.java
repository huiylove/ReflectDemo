package com.huiy.cache.redis;

import redis.clients.jedis.Jedis;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月26日
 * @version 1.0
 * 
 * 实现分布式锁
 * 
 */
public class RedisClient {
	
	public static final String GOODS_ID = "lock_sale_0002";
	
	
	public static void main(String[] args){
		final Jedis jedis =  new Jedis("127.0.0.1");
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				if(jedis.setnx(GOODS_ID,Thread.currentThread().getId()+"")==1){
					System.out.println(Thread.currentThread().getName()+"获取锁成功");
				}else{
					System.out.println(Thread.currentThread().getName()+"获取锁失败");
				}
				if(jedis.get(GOODS_ID).equals(Thread.currentThread().getId())){
					jedis.del("lock_sale_0001");
				}
			}
		}).start();
		
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep((int)Math.random()*20000);
					if(jedis.setnx(GOODS_ID,Thread.currentThread().getId()+"")==1){
						System.out.println(Thread.currentThread().getName()+"获取锁成功");
					}else{
						System.out.println(Thread.currentThread().getName()+"获取锁失败");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
//		System.out.print("连接成功");
//		System.out.print("服务正在运行："+jedis.ping());
//		jedis.set("rst", "Redis String DataType");
//		System.out.println("String类型："+jedis.get("rst"));
//		Jedis jedis =  new Jedis("127.0.0.1");
//		jedis.lpush("list","I");
//		jedis.lpush("list","Love");
//		jedis.lpush("list","Java");
//		List<String> rlist = jedis.lrange("list",0,1);
//		System.out.println("list类型："+jedis.lrange("list",0,1));
//		jedis.sadd("rset", "hello");
//		jedis.sadd("rset", "world");
//		jedis.sadd("rset", "hello");
//		jedis.sadd("rset", "java");
//        Set<String> sset = jedis.smembers("rset");
//        Iterator<String> iterator = sset.iterator();
//        while(iterator.hasNext()){
//        	System.out.println(iterator.next());
//        }
	}
}
