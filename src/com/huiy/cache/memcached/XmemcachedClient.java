package com.huiy.cache.memcached;

import net.rubyeye.xmemcached.MemcachedClient;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��26��
 * @version 1.0
 */
public class XmemcachedClient {
	
	
	protected org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass()); 
	

//    @Autowired  
    private static MemcachedClient memcachedClient;  
    
	static{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/cache/memcached/spring-xmemcached.xml");
		memcachedClient = (MemcachedClient)context.getBean("memcachedClient");
	}
    
    
    /**
     * @param key 缓存的key
     * @param value 缓存的value
     * @param expire 过期时间，以分钟为单位
     * @throws Exception
     */
    public void addCached(String key,Object value,int expire) throws Exception{
    	if(StringUtils.isEmpty(key)||value==null){
            throw new IllegalArgumentException("参数错误！");  
    	}
        boolean isCache = memcachedClient.add(key, expire*60, value);  
//        if(!isCache){
//            throw new IllegalStateException("缓存存储失败！");  
//        }
    }
    
    
    /**
     * @param key 缓存的key
     * @return
     * @throws Exception
     */
    public Object findCache(String key) throws Exception{
    	if(StringUtils.isEmpty(key)){
            throw new IllegalArgumentException("参数错误！");  
    	}
        return memcachedClient.get(key);
    }

    /**
     * @param key
     * @return
     * @throws Exception
     */
    public void deleteCache(String key) throws Exception{
    	if(StringUtils.isEmpty(key)){
            throw new IllegalArgumentException("参数错误！");  
    	}
        memcachedClient.delete(key);
    }
    
    
	public static void main(String[] args) {
		
		XmemcachedClient client = new XmemcachedClient();
		try {
			client.addCached("openid","yegage555ooeegaaekkuujj",0);
			client.addCached("openid","85865544",0);
//			client.deleteCache("openid");
			System.out.println(client.findCache("openid"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/cache/memcached/spring-xmemcached.xml");
//    	MemcachedClient  memcachedClient = (MemcachedClient) context.getBean("memcachedClient");
//    	try {
//    		memcachedClient.set("openid",0,"yuanhui");
//			System.out.println(memcachedClient.get("openid"));
//		} catch (TimeoutException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch blockR
//			e.printStackTrace();
//		} catch (MemcachedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
	}
	
	
	

}
