package com.huiy.concurrency;



/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��11��17��
 * @version 1.0
 *
 *
 */
public class Apple extends Fruit {
	
	public static Apple instance = new Apple();
	
	private static Integer lastNumber;
	private static Integer[] lastFactors;
	
	
//	private Apple(){
//		
//	}
//	
	public static Apple getInstance(){
		return instance;
	}
	 
//	public synchronized void eat(){
//		System.out.println("Apple taste good!");
//		try {
//			Thread.sleep(5000);
//		    super.eat();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
	public synchronized void eat(){
        System.out.println(Thread.currentThread().getName() +" run begin ");
	 	System.out.println("Apple taste good!");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		super.eat();
	}
	
	public static synchronized void grow(){
		 System.out.println(Thread.currentThread().getName() +" run begin ");
		 System.out.println("Apple grow in tree!");
		 try {
			 Thread.sleep(10000);
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	}
	
	public void service(int i){
		System.out.println(Thread.currentThread().getName() +" run begin ");
//		try {
//			Thread.sleep(5000);+
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Integer[] factors = null;
		if(factors==null){
			factors =  new Integer[]{i};
//			for(Integer it:factors){
//				System.out.println(it);
//			}
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			synchronized(this){
				lastNumber = i;
				lastFactors = factors.clone();	
				System.out.println("i======"+i);
				for(Integer it:factors){
					System.out.println(it);
				}
			}
		}
	}
	
	
	public static void main(String[] args){
		//ͬ������顪���������������������ڵĶ���
//		new Thread(){
//			public void run() {
//				try {
//					getInstance().eat();
//					Thread.sleep(5000);
//			        System.out.println(Thread.currentThread().getName() + " run end");
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}.start();
//		
//		new Thread(){
//			public void run() {
//				getInstance().eat();
//		        System.out.println(Thread.currentThread().getName() +" run end");
//			}
//		}.start();
		
		//ͬ������顪����������̬������Class����Ϊ��
//		new Thread(){
//			public void run() {
//				grow();
//		        System.out.println(Thread.currentThread().getName() + " run end");
//			}
//		}.start();
//		
//		new Thread(){
//			public void run() {
//				grow();
//		        System.out.println(Thread.currentThread().getName() +" run end");
//			}
//		}.start();
//		
//		//����
//		Apple a = new Apple();
//		a.eat();
		
		//ͬ������顪��Щ��ʱ�ļ���������������������̨IO�����Կ�����ɣ�ִ����Щ�����ڼ䲻Ҫռ����
//		new Thread(){
//			public void run() {
////				Apple a = new Apple();
////				a.service(5);
//				getInstance().service(5);
//		        System.out.println(Thread.currentThread().getName() + " run end");
//			}
//		}.start();
		
//		new Thread(){
//			public void run() {
////				Apple a = new Apple();
////				a.service(6);
//				getInstance().service(6);
//		        System.out.println(Thread.currentThread().getName() +" run end");
//			}
//		}.start();
//	
//		new Thread(new Thread(){
//			public void run() {
////				Apple a = new Apple();
////				a.service(7);
//				getInstance().service(7);
//		        System.out.println(Thread.currentThread().getName() + " run end");
//			}
//		},"thread_a").start();
		
		//���һ�����ж�����һ��synchronized��static����A��
		//Ҳ������һ��synchronized��instance����B����ô������ͬһ����Obj,
		//�ڶ��߳��зֱ����A��B��������ʱ�����ṹ��ͬ������Ϊ���ǵ�������һ����
		//A����������Obj������󣬶�B������Obj�������Ǹ�Class��


		new Thread(){
			public void run() {
				getInstance().eat();
		        System.out.println(Thread.currentThread().getName() + " run end");
			}
		}.start();
		
		new Thread(){
			public void run() {
				grow();
		        System.out.println(Thread.currentThread().getName() + " run end");
			}
		}.start();
	}
}
	
	
