package com.huiy.multithread;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
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
