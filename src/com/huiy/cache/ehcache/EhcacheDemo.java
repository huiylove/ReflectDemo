package com.huiy.cache.ehcache;



import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月23日
 * @version 1.0
 *
 *
 */
public class EhcacheDemo {
	
	public static void main(String[] args) {
		
		 //指定 ehcache.xml 的位置
		 String fileName="E:\\Eclipse\\Study\\src\\com\\fuiou\\study\\ecache\\ehcache.xml";
		 String path = "/ehcache.xml";
		 CacheManager manager = new CacheManager(fileName);
		 //取出所有的 cacheName
		 String names[] = manager.getCacheNames();
		 for(int i=0;i<names.length;i++){
			 System.out.println(names[i]);
		 }
		 //根据 cacheName 生成一个 Cache 对象
		 //第一种方式：
		 Cache cache = manager.getCache(names[0]);
		 //第二种方式，ehcache 里必须有 defaultCache 存在,"test"可以换成任何值
		// Cache cache = new Cache("test", 1, true, false, 5, 2); 
		// manager.addCache(cache); 
		  
		 //向 Cache 对象里添加 Element 元素，Element 元素有 key，value 键值对组成
		 cache.put(new Element("key1","values1"));
		 Element element = cache.get("key1");
		 System.out.println(element.getValue());
		 Object obj = element.getObjectValue();
		 System.out.println((String)obj);
		 manager.shutdown();
	}
}
