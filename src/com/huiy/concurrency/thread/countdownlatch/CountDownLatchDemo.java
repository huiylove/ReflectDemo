package com.huiy.concurrency.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��15��
 * @version : 1.0
 */
public class CountDownLatchDemo {
	
	public static void main(String[] args){
		final CountDownLatch latch =  new CountDownLatch(2);
		//����1
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("����1����ִ������");
				try {
					Thread.sleep((long)Math.random()*10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("����1ִ�����");
				latch.countDown();//������-1
			}
		}).start();
		
		//����2
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("����2����ִ������");
				try {
					Thread.sleep((long)Math.random()*10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("����2ִ�����");
				latch.countDown();//������-1
			}
		}).start();
//		
		
		//�ȴ�������������ִ����ϣ����̲߳ſ�ʼ
		System.out.println("�ȴ�������������ִ����ϣ����߳�"+Thread.currentThread().getName()+"�ſ�ʼ");
		
		try {
			latch.await();//ͬ����
			System.out.println("������������ִ����ϣ����߳�"+Thread.currentThread().getName()+"��ʼִ��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----");


	}

}
