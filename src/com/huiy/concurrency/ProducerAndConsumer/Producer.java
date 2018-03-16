package com.huiy.concurrency.ProducerAndConsumer;

import java.util.Queue;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
 * @version 1.0
 */
public class Producer extends Thread {
	
	  private Queue<Integer> queue;   
	  private int maxSize;   
//	  private int count;//缓存区的数据
	  
	  public Producer(Queue<Integer> queue, int maxSize, String name){   
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
	      while (queue.size() == maxSize) { //当缓存区满的时候  
	       try {   
	        //进入wait  
	         queue.wait(); 
	       } catch (Exception ex) {   
	        ex.printStackTrace();   
	       }   
	      }   
	      //缓存区未满的时候就可以继续生产，生产后唤醒消费者线程的wait  
	     // queue.add(count++);   
//	      System.out.println(count);
	      //执行缓存区的操作
	      queue.notifyAll();   
	   }   
	  }   
	 }   
}
