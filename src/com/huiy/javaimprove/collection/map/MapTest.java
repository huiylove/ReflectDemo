package com.huiy.javaimprove.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��8��
 * @version 1.0
 */
public class MapTest {

	static HashMap<String,Object> hashMap = new HashMap<String,Object>();
	static ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<String,Object>();
	ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
		
	};

	static volatile int count;
	
	public static void main(String[] args) {
		concurrentHashMap.size();
//		for(int i=0;i<100;i++){
//			new Thread(){
//				@Override   
//				public void run() {
//					addCount();
//					hashMap.put(String.valueOf(count),count);
//					System.out.println(Thread.currentThread().getName()+"����"+count+"---"+hashMap.size());
////					count++;
//				}
//	    	}.start();
//		}
		new Thread(){
			@Override
			public void run() {
				for(int i=0;i<5000;i++){
					hashMap.put(String.valueOf(count),count);
				}
//				count++;
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				for(int i=0;i<5000;i++){
					hashMap.put(String.valueOf(count),count);
				}
//				count++;
			}
		}.start();
		
		
		new Thread(){
			@Override
			public void run() {
				for(int i=0;i<5000;i++){
					hashMap.put(String.valueOf(count),count);
				}
//				count++;
			}
		}.start();
//	   System.out.println("main��������");
		
	}
	
	public synchronized static void addCount(){
		count++;
	}

	public static void main1(String[] args) {
		Hashtable<String,Object> ht = new Hashtable<String,Object>();
		Map<String,Object> smap = Collections.synchronizedMap(new HashMap<String,Object>()); 
	}
	
}
