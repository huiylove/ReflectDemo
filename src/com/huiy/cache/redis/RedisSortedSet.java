package com.huiy.cache.redis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/**
 * @author huiylove
 * @date 2019年3月28日
 * 
 * 在 set 的基础上给集合中每个元素关联了一个分数，往有序集合中插入数据时会自动根据这个分数排序。
 * 
 * 应用场景
 *　 在集合类型的场景上加入排序就是有序集合的应用场景了。
 *  比如根据好友的“亲密度”排序显示好友列表。
 *     排行榜应用
 */
public class RedisSortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Jedis jedis =  new Jedis("127.0.0.1");
		Map<String,Double> fmap = new HashMap<String,Double>();
		fmap.put("james",85d);
		fmap.put("kobe",75d);
		fmap.put("melo",65d);
		fmap.put("paul",27d);
		jedis.zadd("user:yh",fmap);
		jedis.zrevrange("user:yh", 0,-1).forEach((ss)->System.out.println(ss));
		System.out.println("===========");
		jedis.zincrby("user:yh", 60, "paul");
		jedis.zrevrange("user:yh", 0, -1).forEach((ss)->System.out.println(ss));
	}

}
