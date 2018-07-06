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
 * @date   : 2018��6��14��
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
		/*main����ִ������̳߳زſ�ʼ�첽ִ�д���*/
//		System.out.println(Thread.currentThread().getName()+"ִ��ǰ"+latch.getCount());
		latch.countDown();
//		System.out.println(Thread.currentThread().getName()+"ִ�к�"+latch.getCount());
		executorService.shutdown();
	}
		
}
