package com.huiy.cache.redis;

import redis.clients.jedis.Jedis;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��26��
 * @version 1.0
 * 
 * ʵ�ֲַ�ʽ��
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
		
		
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				try {
//					Thread.sleep((int)Math.random()*20000);
//					if(jedis.setnx(GOODS_ID,Thread.currentThread().getId()+"")==1){
//						System.out.println(Thread.currentThread().getName()+"��ȡ���ɹ�");
//					}else{
//						System.out.println(Thread.currentThread().getName()+"��ȡ��ʧ��");
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}).start();
		
		
//		System.out.print("���ӳɹ�");
//		System.out.print("�����������У�"+jedis.ping());
//		jedis.set("rst", "Redis String DataType");
//		System.out.println("String���ͣ�"+jedis.get("rst"));
//		Jedis jedis =  new Jedis("127.0.0.1");
//		jedis.lpush("list","I");
//		jedis.lpush("list","Love");
//		jedis.lpush("list","Java");
//		List<String> rlist = jedis.lrange("list",0,1);
//		System.out.println("list���ͣ�"+jedis.lrange("list",0,1));
//		jedis.sadd("rset", "hello");
//		jedis.sadd("rset", "world");
//		jedis.sadd("rset", "hello");
//		jedis.sadd("rset", "java");
//        Set<String> sset = jedis.smembers("rset");
//        Iterator<String> iterator = sset.iterator();
//        while(iterator.hasNext()){
//        	System.out.println(iterator.next());
//        }
		//防刷单-一秒只能提交200次
//		String redisKey = "api_name_"+"接口名称";
//		Long count = jedis.incr(redisKey);
//		if(count==1){
//			jedis.expire(redisKey, 1);
//		}
//		if(count>200){//防止刷单的安全拦截
//			//return false;//超过就返回false,或者其他错误返回
//		}
	}
}
