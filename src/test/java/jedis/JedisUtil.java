package test.java.jedis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年7月6日
 * @version : 1.0
 */
public class JedisUtil {
	
	private static Map<String,JedisPool> maps = new HashMap<String,JedisPool>();
	
	private static class JedisUtilHolder{
		private static final JedisUtil instance = new JedisUtil();
	}
	
	public static JedisUtil getInstance(){
		return JedisUtilHolder.instance;
	}

	
	public  JedisPool getPool(String host,int port){
		String key = host+":"+port;
		JedisPool jedisPool =  null;
		if(!maps.containsKey(key)){
			JedisPoolConfig config = new JedisPoolConfig();
			//设置config的一些参数
			jedisPool = new JedisPool(config,host,port);
			maps.put(key, jedisPool);
		}else{
			jedisPool = maps.get(key);
		}
		return jedisPool;
	}
	
	
	public  Jedis getJedis(String host,int port){
		Jedis jedis = null;
		try {
			jedis = getPool(host,port).getResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jedis;
	}
	
	public  void closeJedis(Jedis jedis,String host,int port){
		try {
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
