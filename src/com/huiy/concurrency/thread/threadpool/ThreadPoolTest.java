package com.huiy.concurrency.thread.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��8��
 * @version : 1.0
 * �첽ִ�еĻ��ƣ������������ں�ִ̨��
 * һ���̰߳�����ί�и� ExecutorService�����߳̾ͻ����ִ�������������޹ص���������
 * ExecutorService extends Executor
 * 
 * Executors ���ṩ������������������ͬ���͵��̳߳�
 * newSingleThreadExecutor() ����һ��ֻ��һ���̵߳��̳߳�
 * newFixedThreadPool(int numOfThreads)�������̶��߳������̳߳�
 * newCachedThreadPool()���Ը�����Ҫ�����µ��̣߳�����������߳��ǿ��еĻ����������߳�
 * 
 * ExecutorService
 * ThreadPoolExecutor
 * ScheduledThreadPoolExecutor
 */
public class ThreadPoolTest {

	@Test
	public void pooltest() throws InterruptedException, ExecutionException
	{
		Executor executor = Executors.newCachedThreadPool();
		//1��execute()�������κν��
		executor.execute(new Runnable(){

			@Override
			public void run() {
				System.out.print("�̳߳�ִ��");
			}
		});
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		//1�� submit()�������Խ���Runnable��Callable�ӿڵĶ���
		//2��Future���󷵻�������
		//3������ shutDown() ������ֹ�̳߳�
		//4��Future.cancel()ȡ��pending�е�����
		Future future = executorService.submit(new Runnable(){
			@Override
			public void run() {
		        System.out.println("Asynchronous task");  
			}
		});
		
		//����������ִ���򷵻� null  
		System.out.println("future.get()=" + future.get());  
		
//		executorService.shutdown();
		
		
		Future future1 = executorService.submit(new Callable(){ 
			
		    public Object call() throws Exception {  
		        System.out.println("Asynchronous Callable");  
		        return "Callable Result";  
		    }  
		});  
		  
		System.out.println("future.get() = " + future1.get());  

		
	}
}
