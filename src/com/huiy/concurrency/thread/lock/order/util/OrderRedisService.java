package com.huiy.concurrency.thread.lock.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018Äê7ÔÂ4ÈÕ
 * @version : 1.0
 */
public class OrderRedisService implements OrderService {
	 
	static JedisPool jedisPool;
	
	static{
		jedisPool = new JedisPool(new JedisPoolConfig(),"127.0.0.1");
	}

	@Override
    public String getOrderNo() {
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			Jedis jedis = jedisPool.getResource();
			return sdf.format(new Date())+"-"+jedis.incr("order_keys");
		}finally{
			jedisPool.close();
		}
		
	}

}
