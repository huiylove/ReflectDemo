package com.huiy.concurrency.thread.lock.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
 * @version : 1.0
 */
public class NoLockOrder {
	
	public static void main(String[] args){
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch latch =  new CountDownLatch(1);
		for(int i=0;i<10;i++){
			executorService.submit(
					new Runnable(){
						@Override
						public void run() {
							try {
								latch.await();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.printf("线程名%s订单号:%s \r\n",Thread.currentThread().getName(),getOrderNo());
						}
				
			});
		}
		latch.countDown();
		executorService.shutdown();
	}
	
	static int num=0;
	synchronized public static String getOrderNo(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+num++;
	}

}
