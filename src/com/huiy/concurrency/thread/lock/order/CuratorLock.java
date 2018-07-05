package com.huiy.concurrency.thread.lock.order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

import com.huiy.concurrency.thread.lock.order.task.OrderTask2;
import com.huiy.concurrency.thread.lock.order.util.OrderLockService;
import com.huiy.concurrency.thread.lock.order.util.OrderNoLockService;
import com.huiy.concurrency.thread.lock.order.util.OrderService;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月22日
 * @version : 1.0
 */
public class CuratorLock {
	
	public static final CuratorFramework client = CuratorFrameworkFactory.builder().connectString("127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183").retryPolicy(new ExponentialBackoffRetry(100,1)).build();
	
	public static void main(String[] args){
		client.start();
		InterProcessMutex lock = new InterProcessMutex(client,"/bit");
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch latch =  new CountDownLatch(1);
		//todo 不会重复s
		for(int i=0;i<20;i++){
			OrderService orderService = new OrderLockService();
			executorService.submit(new OrderTask2(latch,new OrderNoLockService(),lock));
		}
		latch.countDown();
		executorService.shutdown();
	}
		


}
