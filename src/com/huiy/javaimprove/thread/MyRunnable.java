package com.huiy.javaimprove.thread;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
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
