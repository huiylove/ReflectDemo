package com.huiy.concurrency.thread.sychronized;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
 * @version 1.0
 *
 *
 */
public class MyThread1 extends Thread{
	
	private final Example example;
	 
    public MyThread1(Example example) {
        this.example = example;
    }
 
    @Override
    public void run() {
        Example.exec3();
    }
}