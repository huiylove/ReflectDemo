package com.huiy.javaimprove.thread;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
 * @version 1.0
 *
 *
 */
public class MyRunnable implements Runnable{
	private boolean stop;
	
	@Override
	public void run() {
		for (int i = 0; i < 100 && !stop; i++) {
		   System.out.println(Thread.currentThread().getName() + " " + i);
	   }
	}
	
	public void stopThread() {
		 this.stop = true;
	}

}
