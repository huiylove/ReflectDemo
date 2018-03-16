package com.huiy.javaimprove.collection.map;

import java.util.HashMap;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��8��
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
					System.out.println(Thread.currentThread().getName()+"����"+count+"---"+hashMap.size());
//					count++;
				}
	    	}.start();
		}
	   System.out.println("main��������");
	}
	
	public synchronized static void addCount(){
		count++;
	}

	
}
