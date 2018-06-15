package com.huiy.concurrency.thread.lock.order.task;

import java.util.concurrent.CountDownLatch;

import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 */
public class OrderTask implements Runnable{
	
	private  CountDownLatch latch =  new CountDownLatch(1);
	private  OrderService orderService;
	
	public OrderTask(CountDownLatch latch,OrderService orderService){
		this.latch  = latch;
		this.orderService = orderService;
	}

	@Override
	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("�߳���%s������:%s \r\n",Thread.currentThread().getName(),orderService.getOrderNo());
	}


}
