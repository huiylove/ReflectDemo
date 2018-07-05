package com.huiy.concurrency.thread.lock.order.task;

import java.util.concurrent.CountDownLatch;

import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 */
public class OrderTask2 implements Runnable{
	
	private  CountDownLatch latch =  new CountDownLatch(1);
	private  OrderService orderService;
	InterProcessMutex lock; 
	
	public OrderTask2(CountDownLatch latch,OrderService orderService,InterProcessMutex lock){
		this.latch  = latch;
		this.orderService = orderService;
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			latch.await();
			lock.acquire();
			System.out.printf("�߳���%s������:%s \r\n",Thread.currentThread().getName(),orderService.getOrderNo());
			lock.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
