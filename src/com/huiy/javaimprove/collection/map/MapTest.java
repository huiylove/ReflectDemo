package com.huiy.javaimprove.collection.map;

import java.util.HashMap;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月8日
 * @version 1.0
 */
public class MapTest {

	static HashMap<String,Object> hashMap = new HashMap<String,Object>();
	static volatile int count;
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			new Thread(){
				@Override
				public void run() {
					addCount();
					hashMap.put(String.valueOf(count),count);
					System.out.println(Thread.currentThread().getName()+"运行"+count+"---"+hashMap.size());
//					count++;
				}
	    	}.start();
		}
	   System.out.println("main方法结束");
	}
	
	public synchronized static void addCount(){
		count++;
	}

	
}
