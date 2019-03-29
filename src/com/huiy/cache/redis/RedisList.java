package com.huiy.cache.redis;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月28日
 * 
 * list 是按照插入顺序排序的字符串链表，
 * 可以在头部和尾部插入新的元素（双向链表实现，两端添加元素的时间复杂度为 O(1)）。
 * 插入元素时，如果 key 不存在，redis 会为该 key 创建一个新的链表，如果链表中所有的元素都被移除，该 key 也会从 redis 中移除
 * 
 * 应用场景
(1) 消息队列
　　redis 的 list 数据类型对于大部分使用者来说，是实现队列服务的最经济，最简单的方式。
　　
(2) “最新内容”
因为 list 结构的数据查询两端附近的数据性能非常好，所以适合一些需要获取最新数据的场景，比如新闻类应用的 “最近新闻”。
 */
public class RedisList {
	
	
	public static void main(String[] args) {
		final Jedis jedis =  new Jedis("127.0.0.1");
		jedis.del("list");
		jedis.del("list2");
		jedis.lpush("list","1");
		jedis.rpush("list","end");
		jedis.lpush("list", "2");
		jedis.lpush("list", "3");
		jedis.lpush("list2","4","5","6");
		List rlists = jedis.lrange("list", 0, jedis.llen("list"));
		rlists.forEach((l)->System.out.println(l));
		jedis.lrange("list2",0,jedis.llen("list2")).forEach((l)->System.out.println(l));

	}

}
