package com.huiy.cache.memcached;

import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiy.springioc.JavaCollection;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��26��
 * @version 1.0
 */
public class XmemcachedClient {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/cache/memcached/spring-xmemcached.xml");
    	MemcachedClient  memcachedClient = (MemcachedClient) context.getBean("memcachedClient");
    	try {
			memcachedClient.set("openid",0,"yuanhui");
			System.out.println(memcachedClient.get("openid"));
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blockR
			e.printStackTrace();
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}

}
