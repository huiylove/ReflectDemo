package com.huiy.springioc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
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
        //����ʵ����Runnable�ӿڶ���
        for(int i=1;i<10;i++){
        	 Thread t = new MyThread(i);
             taskExecutor.execute(t);
        }
        /* ʹ��Callable��Future�ӿڴ����߳�
         * �����Ǵ���Callable�ӿڵ�ʵ���࣬��ʵ��call()������
         * ��ʹ��FutureTask������װCallableʵ����Ķ���
         * ���Դ�FutureTask������ΪThread�����target�������߳�
         * */
        Callable<String> gb = new GetBack();// ����Callable����
        FutureTask<String> dbtask = new FutureTask<String>(gb); //ʹ��FutureTask����װCallable����
        taskExecutor.submit(dbtask);  
        try {
			String return_str = dbtask.get();
			//ft.get()������ȡ���߳�call()�����ķ���ֵʱ��
			//�����̴߳˷�����δִ����ϣ�ft.get()������һֱ������ֱ��call()����ִ����ϲ���ȡ������ֵ
			System.out.println(return_str);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
        taskExecutor.shutdown();
	}
}
