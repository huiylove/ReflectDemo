package com.huiy.concurrency.thread.deadlock;
/** 
 * @author : yuanhui 
 * @date   : 2018��3��15��
 * @version 1.0
 * ��������ָ�������������ϵĽ�����ִ�й�����,
 * ��������Դ����ɵ�һ�ֻ���ȴ�������,������������,���Ƕ����޷��ƽ���ȥ
 * 1.���� 2.�����뱣��3.������4.ѭ���ȴ�
 */
public class DeadLockDemo {
	private final Object objectA;
	private final Object objectB;
	
	public DeadLockDemo(Object objectA,Object objectB){
		this.objectA = objectA;
		this.objectB = objectB;
	}
	
	//�߳�A
	public void mothodA(){
		synchronized(objectA){
			synchronized(objectB){
				System.out.println("�߳�Aִ�гɹ�");
			}
		}
	}
	
	//�߳�B
	public void mothodB(){
		synchronized(objectB){
			synchronized(objectA){
				System.out.println("�߳�Bִ�гɹ�");
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
