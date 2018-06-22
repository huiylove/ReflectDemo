package com.huiy.concurrency.thread.Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 * 两个线程到同一个点（阻塞点）交换数据
 * 1、两个线程交换数据
 * 2、校对工作
 */
public class ExchangerDemo {

	public static void main(String[] args) {
		//交换器 交换String类型数据
		final Exchanger<String> ec = new Exchanger<String>();
		
		//线程池
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	//绑架团伙
    	threadPool.execute(new Runnable(){
				@Override
				public void run(){
					String returnStr;
					try {
						Thread.sleep((long)Math.random()*10000);
						returnStr = ec.exchange("小乔");
						System.out.println("张三用小乔交换回  "+returnStr);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
    	});
    	
    	//大乔
    	threadPool.execute(new Runnable(){
			@Override
			public void run(){
				String returnStr;
				try {
					Thread.sleep((long)Math.random()*10000);
					returnStr = ec.exchange("一千万");
					System.out.println("大乔用一千万交换回  "+returnStr);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	    });
    	
    	threadPool.shutdown();
		
	}

}
