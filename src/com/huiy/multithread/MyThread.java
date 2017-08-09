package com.huiy.multithread;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class MyThread extends Thread{
	
	 	private final Example example;
	 
	    public MyThread(Example example) {
	        this.example = example;
	    }
	 
	    @Override
	    public void run() {
	        example.exec3();
	    }
}
