package com.huiy.designpattern.producerAconsumer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
 * @version 1.0
 *
 *
 */
public class TestMain {
	 public static void main(String[] args) throws Exception{  
	        TestQueue tq = new TestQueue();  
	        TestProduct tp = new TestProduct(tq);  
	        TestConsumer tc = new TestConsumer(tq);  
	        Thread t1= new Thread(tp);  
	        Thread t2= new Thread(tc);  
	        t1.start();  
	        t2.start();  
	 }  
}
