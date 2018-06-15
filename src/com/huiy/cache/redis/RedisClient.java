package com.huiy.cache.redis;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��26��
 * @version 1.0
 */
public class RedisClient {
	public static void main(String[] args){
		Jedis jedis =  new Jedis("127.0.0.1");
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
		jedis.sadd("rset", "hello");
		jedis.sadd("rset", "world");
		jedis.sadd("rset", "hello");
		jedis.sadd("rset", "java");
        Set<String> sset = jedis.smembers("rset");
        Iterator<String> iterator = sset.iterator();
        while(iterator.hasNext()){
        	System.out.println(iterator.next());
        }
	}
}
