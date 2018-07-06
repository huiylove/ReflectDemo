package com.huiy.concurrency.thread.lock.order.task;

import java.util.concurrent.CountDownLatch;

import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
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
			latch.await();//同步点，倒计时计数器count为0,开始执行；
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("线程名%s订单号:%s \r\n",Thread.currentThread().getName(),orderService.getOrderNo());
	}

}
