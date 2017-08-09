package com.huiy.javaimprove.thread;

/**
 * 类功能描述
 * 
 * @author : yuanhui
 * @date : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 30) {
				thread.start();
			}
			if (i == 40) {
				myRunnable.stopThread();
			}
		}

	}

}
