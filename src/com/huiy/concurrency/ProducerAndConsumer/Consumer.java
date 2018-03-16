package com.huiy.concurrency.ProducerAndConsumer;

import java.util.Queue;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��5��
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
	       while(queue.isEmpty()) { //��������Ϊ�յ�ʱ��  
	       try {   
	    	   //����wait  
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
