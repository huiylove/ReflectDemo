package com.huiy.cache.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月28日
 * set 数据类型是一个集合（没有排序，不重复），可以对 set 类型的数据进行添加、删除、判断是否存在等操作（时间复杂度是 O(1) ） 
　　set 集合不允许数据重复，如果添加的数据在 set 中已经存在，将只保留一份。 
　　set 类型提供了多个 set 之间的聚合运算，如求交集、并集、补集，这些操作在 redis 内部完成，效率很高。
 * 
 * 应用场景
　　set 类型的特点是——不重复且无序的一组数据，并且具有丰富的计算功能，在一些特定的场景中可以高效的解决一般关系型数据库不方便做的工作。
1. “共同好友列表”
　　社交类应用中，获取两个人或多个人的共同好友，两个人或多个人共同关注的微博这样类似的功能，用 MySQL 的话操作很复杂，可以把每个人的好友 id 存到集合中，获取共同好友的操作就可以简单到一个取交集的命令就搞定。
 * 
 */
public class RedisSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Jedis jedis =  new Jedis("127.0.0.1");
		jedis.sadd("user:zs","james","melo","paul","kobe");
		jedis.sadd("user:ls","wade","melo","paul","kobe");
		//计算交集
		Set<String> set = jedis.sinter("user:zs","user:ls");
		set.forEach((s)->System.out.println(s));
		//计算并集
		jedis.sunion("user:zs","user:ls").forEach((s)->System.out.print(s+"="));
		System.out.println();
		//计算补集
		jedis.sdiff("user:zs","user:ls").forEach((s)->System.out.print(s+"="));
		System.out.println();
		jedis.sdiff("user:ls","user:zs").forEach((s)->System.out.print(s+"="));




	}

}
