package com.huiy.javaimprove.thread;

/**
 * �๦������
 * 
 * @author : yuanhui
 * @date : 2017��3��30��
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
