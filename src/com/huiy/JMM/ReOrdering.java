package com.huiy.JMM;

import com.huiy.concurrency.thread.sychronized.Apple;

/** 
 * @author : yuanhui 
 * @date   : 2018年3月13日
 * @version 1.0
 *  指令重排序
 *  线程A执行writer()方法 
 *  线程B执行reader()方法 
 *  线程B看到y的值为2，不一定能确保x的值为1；
 *  因为在writer()方法里面可能发生指令重排序，y的写入动作可能在x之前，这时，B看到的x还是0
 *  final变量保证内存可见性，在构造函数中进行初始化后，对其他线程可见
 *  volatile变量可以禁止指令重排序，确保volatile变量之前的操作都可以被执行；比如读到V的值为true,则可以读到x=1,y=2
 * 
 */
public class ReOrdering {
	public static ReOrdering reorder = new ReOrdering();
    int x = 0,y = 0;
    final int z;
    int m = 0;
	volatile boolean v = false;
	
	public static ReOrdering getInstance(){
		return reorder;
	}
	
	public ReOrdering(){
		m = 5;
		z = 3;
	}
	
	public void writer(){
		x = 1;
		y = 2;
		v = true;
	}
	
	public void reader(){
//		int r 1 = x;
//		int r2 = y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(v);
	}
	
	public static void main(String[] args){
		
	     new Thread("A"){
			@Override
			public void run() {
				getInstance().writer();
//				reOrder.reader();
			}
	    	 
	     }.start();
			
	     new Thread("B"){
				@Override
				public void run() {
					getInstance().reader();
				}
		    	 
		   }.start();
				
		
	}

}
