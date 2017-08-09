package com.huiy.springioc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月29日
 * @version 1.0
 *
 *
 */
public class ThreadPoolTest {
	

	public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/springioc/beans.xml");
//        TaskExecutor taskExecutor = (TaskExecutor )context.getBean("taskExecutor");
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor)context.getBean("taskExecutor");
//        ExecutorService taskExecutor = Executors.newCachedThreadPool();
        //创建实现了Runnable接口对象
        for(int i=1;i<10;i++){
        	 Thread t = new MyThread(i);
             taskExecutor.execute(t);
        }
        /* 使用Callable和Future接口创建线程
         * 具体是创建Callable接口的实现类，并实现call()方法。
         * 并使用FutureTask类来包装Callable实现类的对象，
         * 且以此FutureTask对象作为Thread对象的target来创建线程
         * */
        Callable<String> gb = new GetBack();// 创建Callable对象
        FutureTask<String> dbtask = new FutureTask<String>(gb); //使用FutureTask来包装Callable对象
        taskExecutor.submit(dbtask);  
        try {
			String return_str = dbtask.get();
			//ft.get()方法获取子线程call()方法的返回值时，
			//当子线程此方法还未执行完毕，ft.get()方法会一直阻塞，直到call()方法执行完毕才能取到返回值
			System.out.println(return_str);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
        taskExecutor.shutdown();
	}
}
