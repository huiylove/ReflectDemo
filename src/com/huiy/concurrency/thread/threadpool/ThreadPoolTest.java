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
 * @date   : 2018年6月8日
 * @version : 1.0
 * 异步执行的机制，可以让任务在后台执行
 * 一旦线程把任务委托给 ExecutorService，该线程就会继续执行与运行任务无关的其它任务
 * ExecutorService extends Executor
 * 
 * Executors 类提供工厂方法用来创建不同类型的线程池
 * newSingleThreadExecutor() 创建一个只有一个线程的线程池
 * newFixedThreadPool(int numOfThreads)来创建固定线程数的线程池
 * newCachedThreadPool()可以根据需要创建新的线程，但如果已有线程是空闲的会重用已有线程
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
		//1、execute()不返回任何结果
		executor.execute(new Runnable(){

			@Override
			public void run() {
				System.out.print("线程池执行");
			}
		});
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		//1、 submit()方法可以接受Runnable和Callable接口的对象
		//2、Future对象返回运算结果
		//3、调用 shutDown() 方法终止线程池
		//4、Future.cancel()取消pending中的任务
		Future future = executorService.submit(new Runnable(){
			@Override
			public void run() {
		        System.out.println("Asynchronous task");  
			}
		});
		
		//如果任务结束执行则返回 null  
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
