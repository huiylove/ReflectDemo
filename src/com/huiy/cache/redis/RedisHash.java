package com.huiy.cache.redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月28日
 * hash 类型很像一个关系型数据库的数据表，
 * hash 的 Key 是一个唯一值，Value 部分是一个 hashmap 的结构。
 * 
 * 应用场景
   hash 类型十分适合存储对象类数据，相对于在 string 中介绍的把对象转化为 json 字符串存储，hash 的结构可以任意添加或删除‘字段名’，更加高效灵活。
 */
public class RedisHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Jedis jedis =  new Jedis("127.0.0.1");
//		jedis.hset("user:1", "name", "张三");
		Map<String,String> user = new HashMap<String,String>();
		user.put("name","张三");
		user.put("email","zs@qq.com");
		jedis.hmset("cookieId",user);
		List<String> names = jedis.hmget("cookieId","name","email");
		names.forEach((n)->System.out.println(n));
	}

}
