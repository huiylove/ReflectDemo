package com.huiy.concurrency.ProducerAndConsumer;

import java.util.Queue;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
 * @version 1.0
 */
public class Consumer extends Thread {
	
	 private Queue<Integer> queue;   
	  private int maxSize;   
	  
	  public Consumer(Queue<Integer> queue, int maxSize, String name){   
	   super(name); 
	   this.queue = queue; 
	   this.maxSize = maxSize;   
	  }
	  
	  
	  @Override 
	  public void run()   
	  {   
	   while (true)   
	    {   
	     synchronized (queue) {   
	       while(queue.isEmpty()) { //当缓存区为空的时候  
	       try {   
	    	   //进入wait  
	    	   queue.wait();   
	       } catch (Exception ex) {   
	        ex.printStackTrace();   
	       }   
	      }   
	      queue.notifyAll();   
	   }   
	  }   
	 }   
}
