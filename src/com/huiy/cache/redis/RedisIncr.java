package com.huiy.cache.redis;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年4月22日
 */
public class RedisIncr {
	
	public static void main(String[] args) {
		final Jedis jedis =  new Jedis("127.0.0.1");
		long count = jedis.incr("token");
		if(count==1){
			jedis.expire("token",1);//秒
		}
		if(count>200){
			System.out.println("接口访问频率受限");
		}

	}
}
