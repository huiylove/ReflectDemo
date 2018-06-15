package com.huiy.concurrency.thread.lock.order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.huiy.concurrency.thread.lock.order.task.OrderTask;
import com.huiy.concurrency.thread.lock.order.util.OrderLockService;
import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 */
public class JVMLockOrder {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch latch =  new CountDownLatch(1);
		//todo �����ظ�
		for(int i=0;i<20;i++){
			OrderService orderService = new OrderLockService();
			executorService.submit(new OrderTask(latch,orderService));
		}
		latch.countDown();
		executorService.shutdown();
	}
		
}
