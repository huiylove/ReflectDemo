package com.huiy.concurrency.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 */
public class CountDownLatchDemo {
	
	public static void main(String[] args){
		final CountDownLatch latch =  new CountDownLatch(2);
		//任务1
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("任务1正在执行任务");
				try {
					Thread.sleep((long)Math.random()*10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("任务1执行完毕");
				latch.countDown();//计数器-1
			}
		}).start();
		
		//任务2
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("任务2正在执行任务");
				try {
					Thread.sleep((long)Math.random()*10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("任务2执行完毕");
				latch.countDown();//计数器-1
			}
		}).start();
//		
		
		//等待其他两个任务执行完毕，主线程才开始
		System.out.println("等待其他两个任务执行完毕，主线程"+Thread.currentThread().getName()+"才开始");
		
		try {
			latch.await();//同步点
			System.out.println("其他两个任务执行完毕，主线程"+Thread.currentThread().getName()+"开始执行");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----");


	}

}
