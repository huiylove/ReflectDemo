package com.huiy.concurrency.thread.lock.order.task;

import java.util.concurrent.CountDownLatch;

import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
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
			System.out.printf("线程名%s订单号:%s \r\n",Thread.currentThread().getName(),orderService.getOrderNo());
			lock.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
