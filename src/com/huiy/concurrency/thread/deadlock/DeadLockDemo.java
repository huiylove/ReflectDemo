package com.huiy.concurrency.thread.deadlock;
/** 
 * @author : yuanhui 
 * @date   : 2018年3月15日
 * @version 1.0
 * 死锁：是指两个或两个以上的进程在执行过程中,
 * 因争夺资源而造成的一种互相等待的现象,若无外力作用,它们都将无法推进下去
 * 1.互斥 2.请求与保持3.不剥夺4.循环等待
 */
public class DeadLockDemo {
	private final Object objectA;
	private final Object objectB;
	
	public DeadLockDemo(Object objectA,Object objectB){
		this.objectA = objectA;
		this.objectB = objectB;
	}
	
	//线程A
	public void mothodA(){
		synchronized(objectA){
			synchronized(objectB){
				System.out.println("线程A执行成功");
			}
		}
	}
	
	//线程B
	public void mothodB(){
		synchronized(objectB){
			synchronized(objectA){
				System.out.println("线程B执行成功");
			}
		}
	}
	
	public static void main(String[] args){
		Object objectA = new Object();
		Object objectB = new Object();
		DeadLockDemo demo = new DeadLockDemo(objectA,objectB);
		ThreadA threadA = new ThreadA(demo);
		ThreadB threadB = new ThreadB(demo);
		threadA.run();
		threadB.run();
	}

}
