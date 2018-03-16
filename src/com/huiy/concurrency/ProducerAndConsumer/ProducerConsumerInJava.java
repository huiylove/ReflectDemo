package com.huiy.concurrency.ProducerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
 * @version 1.0
 */
public class ProducerConsumerInJava {

	public static void main(String[] args) {
		  Queue<Integer> buffer = new LinkedList<Integer>();   
		  int maxSize = 10;   
		  Thread producer = new Producer(buffer, maxSize, "PRODUCER");   
		  Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
		  producer.start();   
		  consumer.start(); 
	}

}
