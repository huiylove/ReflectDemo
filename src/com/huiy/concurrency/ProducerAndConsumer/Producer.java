package com.huiy.concurrency.ProducerAndConsumer;

import java.util.Queue;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��5��
 * @version 1.0
 */
public class Producer extends Thread {
	
	  private Queue<Integer> queue;   
	  private int maxSize;   
//	  private int count;//������������
	  
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
	      while (queue.size() == maxSize) { //������������ʱ��  
	       try {   
	        //����wait  
	         queue.wait(); 
	       } catch (Exception ex) {   
	        ex.printStackTrace();   
	       }   
	      }   
	      //������δ����ʱ��Ϳ��Լ������������������������̵߳�wait  
	     // queue.add(count++);   
//	      System.out.println(count);
	      //ִ�л������Ĳ���
	      queue.notifyAll();   
	   }   
	  }   
	 }   
}
