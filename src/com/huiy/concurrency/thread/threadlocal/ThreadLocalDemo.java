package com.huiy.concurrency.thread.threadlocal;
/** 
 * @author : yuanhui 
 * @date   : 2018��3��21��
 * @version 1.0
 * ThreadLocal�����������е�������⣬ ������������Ϊ�ǡ������̡߳��� 
 * ��ʵ������ά�����̵߳ı����� �����������ԭ���⣬�����ҿ�������ȥ��ThreadLocal��Դ�룬������⡣
 * ThreadLocal ����������Java�еĸ��������������Python,C#��Ҳ�У��������ơ�
 * ThreadLocal���ճ��������õò��࣬�����ڿ�ܣ���Spring�����Ǹ������Եļ��������������AOP���������ҵ�
 */


public class ThreadLocalDemo {
	static ThreadLocal<String> threadLocalA = new ThreadLocal<String>();
	static ThreadLocal<Integer> threadLocalB = new ThreadLocal<Integer>();

	public static void main(String[] args) {
		new Thread("threadA"){
			public void run() {
				threadLocalA.set("threadA��ֵA");
				threadLocalB.set(1);
//				getThreadLocalVal();
				ThreadLocalDemo1.getThreadLocalA();
				ThreadLocalDemo1.getThreadLocalB();
			}
		}.start();

		new Thread("threadB"){
			public void run() {
				threadLocalA.set("threadB��ֵB");
				threadLocalB.set(2);
//				getThreadLocalVal();
			}
		}.start();
	}

	
	public static void getThreadLocalVal(){
        System.out.println(Thread.currentThread().getName()+"�õ�threadLocalA��ֵ" + threadLocalA.get());
        System.out.println(Thread.currentThread().getName()+"�õ�threadLocalB��ֵ" + threadLocalB.get());

	}
}
