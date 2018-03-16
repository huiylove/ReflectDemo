package com.huiy.multithread.synchronizeddemo;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class Example {
	
	   public synchronized static void exec3() {
	        for (int i = 0; i < 10; i++) {
	            try {
	                long time = (long) (Math.random() * 1000);
	                Thread.sleep(time);//不会是释放锁
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	 
	            System.out.printf("%s,Static[%d]\n", Thread.currentThread().getName(), i);
	        }
	    }
	 
	    public synchronized void exec() {
	        for (int i = 0; i < 10; i++) {
	            try {
	                long time = (long) (Math.random() * 1000);
	                Thread.sleep(time);
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	 
	            System.out.printf("%s,Hello[%d]\n", Thread.currentThread().getName(), i);
	        }
	 
	    }
	 
	    public synchronized void exec2() {
	        for (int i = 0; i < 10; i++) {
	            try {
	                long time = (long) (Math.random() * 1000);
	                Thread.sleep(time);
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	 
	            System.out.printf("%s,world[%d]\n", Thread.currentThread().getName(), i);
	        }
	    }
}
	  
	 
