package com.huiy.concurrency.thread.lock.order.automic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.huiy.concurrency.thread.lock.order.task.OrderTask;
import com.huiy.concurrency.thread.lock.order.util.OrderAtomicService;
import com.huiy.concurrency.thread.lock.order.util.OrderRedisService;
import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
 * @version : 1.0
 */
public class RedisOrder {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch latch =  new CountDownLatch(1);
		OrderService orderService = new OrderRedisService();
		for(int i=0;i<10;i++){
			executorService.submit(new OrderTask(latch,orderService));
		}
		/*main函数执行完后，线程池才开始异步执行代码*/
//		System.out.println(Thread.currentThread().getName()+"执行前"+latch.getCount());
		latch.countDown();
//		System.out.println(Thread.currentThread().getName()+"执行后"+latch.getCount());
		executorService.shutdown();
	}
		
}
