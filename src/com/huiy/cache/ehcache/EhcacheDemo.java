package com.huiy.cache.ehcache;



import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��23��
 * @version 1.0
 *
 *
 */
public class EhcacheDemo {
	
	public static void main(String[] args) {
		
		 //ָ�� ehcache.xml ��λ��
		 String fileName="E:\\Eclipse\\Study\\src\\com\\fuiou\\study\\ecache\\ehcache.xml";
		 String path = "/ehcache.xml";
		 CacheManager manager = new CacheManager(fileName);
		 //ȡ�����е� cacheName
		 String names[] = manager.getCacheNames();
		 for(int i=0;i<names.length;i++){
			 System.out.println(names[i]);
		 }
		 //���� cacheName ����һ�� Cache ����
		 //��һ�ַ�ʽ��
		 Cache cache = manager.getCache(names[0]);
		 //�ڶ��ַ�ʽ��ehcache ������� defaultCache ����,"test"���Ի����κ�ֵ
		// Cache cache = new Cache("test", 1, true, false, 5, 2); 
		// manager.addCache(cache); 
		  
		 //�� Cache ��������� Element Ԫ�أ�Element Ԫ���� key��value ��ֵ�����
		 cache.put(new Element("key1","values1"));
		 Element element = cache.get("key1");
		 System.out.println(element.getValue());
		 Object obj = element.getObjectValue();
		 System.out.println((String)obj);
		 manager.shutdown();
	}
}
