package com.huiy.multithread;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
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
