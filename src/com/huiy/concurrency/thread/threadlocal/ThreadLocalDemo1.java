package com.huiy.concurrency.thread.threadlocal;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��21��
 * @version 1.0
 */
public class ThreadLocalDemo1 {

	public static void getThreadLocalA(){
        System.out.println(Thread.currentThread().getName()+"�õ�threadLocalA��ֵ" + ThreadLocalDemo.threadLocalA.get());
	}
	
	public static void getThreadLocalB(){
        System.out.println(Thread.currentThread().getName()+"�õ�threadLocalB��ֵ" + ThreadLocalDemo.threadLocalB.get());
	}
}
