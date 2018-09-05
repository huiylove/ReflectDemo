package test.java.jedis;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年7月6日
 * @version : 1.0
 */
public class JedisTest {
	
	private static final String HOST = "127.0.0.1";
	private static final int PORT = 6379;
	private static Jedis jedis = null;
	
	@BeforeClass
	public static void init(){
		jedis = JedisUtil.getInstance().getJedis(HOST, PORT);
	}
	
	@Test
	public  void testKey()
	{
		jedis.set("huiylove","hope");
		
		assertTrue(jedis.exists("huiylove"));
	}
	
	
//	@Test
	
	/**
	 * 复杂的计数功能的缓存
	 */
	public void testString()
	{
		jedis.mset("key1","ddd","key2","eeee");
		System.out.println(jedis.mget("key1"));
	}
	
	
//	@Test
	/**
	 * 使用List的数据结构，可以做简单的消息队列的功能
	 * 可以利用lrange命令，做基于redis的分页功能
	 */
	public void testList()
	{
		jedis.lpush("lists","aaa","bbbb","eeee","ffff");
		jedis.lpush("lists","cccc");
		jedis.lpush("lists1","3","5","4","9");
		System.out.println(jedis.lrange("lists", 0, -1));
		System.out.println(jedis.sort("lists1"));
	}
	
	
//	@Test
	/**
	 * 全局去重的功能
	 * 计算共同喜好，全部的喜好，自己独有的喜好等功能
	 */
	public void testSet()
	{
		jedis.sadd("set1","s1","s2","s3");
		jedis.sadd("set2","s2","s3","s4","s5","s6");
		System.out.println(jedis.smembers("set1"));
		System.out.println("set1和set2的交集:"+jedis.sinter("set1","set2"));
		System.out.println("set1和set2的并集:"+jedis.sunion("set1","set2"));
		System.out.println("set1和set2的差集:"+jedis.sdiff("set1","set2"));

	}
	
//	@Test
	/**
	 * sorted set多了一个权重参数score,集合中的元素能够按score进行排列。可以做排行榜应用，取TOP N操作
	 */
	public void testSortedSet()
	{
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("m1",5d);
		map.put("m2",7d);
		map.put("m3",4d);
		jedis.zadd("zset", map);
		System.out.println("zset的元素:"+jedis.zrange("zset", 0, -1));
		System.out.println("m1的元素:"+jedis.zscore("zset","m1"));
		System.out.println("m1的排名:"+jedis.zrank("zset","m1"));
	}
	
	@Test
	public void testHash()
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("m1","hello");
		map.put("m2","world");
		map.put("m3","huiylove,you are the best");
		jedis.hmset("hash1",map);
		jedis.hset("hash1","m4","love is nowhere" );
		System.out.println("hash1的元素:"+jedis.hgetAll("hash1"));
		System.out.println("hash1的keys:"+jedis.hkeys("hash1"));
		System.out.println("hash1的values:"+jedis.hvals("hash1"));
	}
	
	
	@AfterClass
	public static void close(){
		JedisUtil.getInstance().closeJedis(jedis,HOST, PORT);

	}

}
