package com.huiy.concurrency;



/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年11月17日
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
		//同步代码块—内置锁——方法调用所在的对象
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
		
		//同步代码块—内置锁—静态方法以Class对象为锁
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
//		//重入
//		Apple a = new Apple();
//		a.eat();
		
		//同步代码块—有些耗时的计算或操作，比如网络或控制台IO，难以快速完成，执行这些操作期间不要占有锁
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
		
		//如果一个类中定义了一个synchronized的static函数A，
		//也定义了一个synchronized的instance函数B，那么这个类的同一对象Obj,
		//在多线程中分别访问A和B两个方法时，不会构成同步，因为它们的锁都不一样。
		//A方法的锁是Obj这个对象，而B的锁是Obj所属的那个Class。


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
	
	
