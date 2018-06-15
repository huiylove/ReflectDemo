package com.huiy.concurrency.thread.threadlocal;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月21日
 * @version 1.0
 */
public class ThreadLocalDemo1 {

	public static void getThreadLocalA(){
        System.out.println(Thread.currentThread().getName()+"得到threadLocalA的值" + ThreadLocalDemo.threadLocalA.get());
	}
	
	public static void getThreadLocalB(){
        System.out.println(Thread.currentThread().getName()+"得到threadLocalB的值" + ThreadLocalDemo.threadLocalB.get());
	}
}
