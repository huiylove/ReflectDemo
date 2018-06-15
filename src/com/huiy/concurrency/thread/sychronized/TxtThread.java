package com.huiy.concurrency.thread.sychronized;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��5��
 * @version 1.0
 */
public class TxtThread implements Runnable { 
	
	int num = 100; 
	String str = new String();

	public void run() { 
	   synchronized (str) { 
	    while (num > 0) {
		     try { 
		      Thread.sleep(1); 
		     } catch (Exception e) { 
		      e.getMessage(); 
		     } 
		     System.out.println(Thread.currentThread().getName() 
		       + "this is " + num--); 
	    } 
	   } 
	} 
	
}
