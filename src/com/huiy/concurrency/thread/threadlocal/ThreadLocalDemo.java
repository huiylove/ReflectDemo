package com.huiy.concurrency.thread.threadlocal;
/** 
 * @author : yuanhui 
 * @date   : 2018年3月21日
 * @version 1.0
 * ThreadLocal这个名字起得有点让人误解， 很容易让人认为是“本地线程”， 
 * 其实是用来维护本线程的变量。 对照着上面的原理讲解，我想大家可以自行去看ThreadLocal的源码，轻松理解。
 * ThreadLocal 并不仅仅是Java中的概念，其他语言例如Python,C#中也有，作用类似。
 * ThreadLocal在日常工作中用得不多，但是在框架（如Spring）中是个基础性的技术，在事务管理，AOP等领域都能找到
 */


public class ThreadLocalDemo {
	static ThreadLocal<String> threadLocalA = new ThreadLocal<String>();
	static ThreadLocal<Integer> threadLocalB = new ThreadLocal<Integer>();

	public static void main(String[] args) {
		new Thread("threadA"){
			public void run() {
				threadLocalA.set("threadA的值A");
				threadLocalB.set(1);
//				getThreadLocalVal();
				ThreadLocalDemo1.getThreadLocalA();
				ThreadLocalDemo1.getThreadLocalB();

			}
		}.start();

		new Thread("threadB"){
			public void run() {
				threadLocalA.set("threadB的值B");
				threadLocalB.set(2);
//				getThreadLocalVal();
			}
		}.start();
	}

	
	public static void getThreadLocalVal(){
        System.out.println(Thread.currentThread().getName()+"得到threadLocalA的值" + threadLocalA.get());
        System.out.println(Thread.currentThread().getName()+"得到threadLocalB的值" + threadLocalB.get());

	}
}
