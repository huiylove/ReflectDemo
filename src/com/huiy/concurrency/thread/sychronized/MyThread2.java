package com.huiy.concurrency.thread.sychronized;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class MyThread2 extends Thread{
	
	 	private final Example2 example;
	 
	    public MyThread2(Example2 example) {
	        this.example = example;
	    }
	 
	    @Override
	    public void run() {
	        example.exec();
	    }
}
