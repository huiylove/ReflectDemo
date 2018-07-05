package com.huiy.concurrency.thread.lock.order.automic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.huiy.concurrency.thread.lock.order.task.OrderTask;
import com.huiy.concurrency.thread.lock.order.util.OrderAtomicService;
import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018Äê6ÔÂ14ÈÕ
 * @version : 1.0
 */
public class JVMAtomicOrder {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch latch =  new CountDownLatch(1);
		OrderService orderService = new OrderAtomicService();
		for(int i=0;i<20;i++){
			executorService.submit(new OrderTask(latch,orderService));
		}
		latch.countDown();
		executorService.shutdown();
	}
		
}
