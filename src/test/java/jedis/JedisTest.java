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
 * @date   : 2018��7��6��
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
	 * ���ӵļ������ܵĻ���
	 */
	public void testString()
	{
		jedis.mset("key1","ddd","key2","eeee");
		System.out.println(jedis.mget("key1"));
	}
	
	
//	@Test
	/**
	 * ʹ��List�����ݽṹ���������򵥵���Ϣ���еĹ���
	 * ��������lrange���������redis�ķ�ҳ����
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
	 * ȫ��ȥ�صĹ���
	 * ���㹲ͬϲ�ã�ȫ����ϲ�ã��Լ����е�ϲ�õȹ���
	 */
	public void testSet()
	{
		jedis.sadd("set1","s1","s2","s3");
		jedis.sadd("set2","s2","s3","s4","s5","s6");
		System.out.println(jedis.smembers("set1"));
		System.out.println("set1��set2�Ľ���:"+jedis.sinter("set1","set2"));
		System.out.println("set1��set2�Ĳ���:"+jedis.sunion("set1","set2"));
		System.out.println("set1��set2�Ĳ:"+jedis.sdiff("set1","set2"));

	}
	
//	@Test
	/**
	 * sorted set����һ��Ȩ�ز���score,�����е�Ԫ���ܹ���score�������С����������а�Ӧ�ã�ȡTOP N����
	 */
	public void testSortedSet()
	{
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("m1",5d);
		map.put("m2",7d);
		map.put("m3",4d);
		jedis.zadd("zset", map);
		System.out.println("zset��Ԫ��:"+jedis.zrange("zset", 0, -1));
		System.out.println("m1��Ԫ��:"+jedis.zscore("zset","m1"));
		System.out.println("m1������:"+jedis.zrank("zset","m1"));
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
		System.out.println("hash1��Ԫ��:"+jedis.hgetAll("hash1"));
		System.out.println("hash1��keys:"+jedis.hkeys("hash1"));
		System.out.println("hash1��values:"+jedis.hvals("hash1"));
	}
	
	
	@AfterClass
	public static void close(){
		JedisUtil.getInstance().closeJedis(jedis,HOST, PORT);

	}

}
