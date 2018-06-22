package com.huiy.concurrency.thread.lock.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 * CountDownLatch
 * ����ʱ������
 * �������ȴ���������ִ��������ִ��
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
								System.out.printf("�߳���%s������:%s \r\n",Thread.currentThread().getName(),getOrderNo());
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
				
			});
		}
		latch.countDown();
		executorService.shutdown();
	}
	
	static int num=0;
    public static String getOrderNo(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+num++;
	}

}
