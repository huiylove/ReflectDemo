package com.huiy.multithread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args){
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
         
        for(int i=0;i<10;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("�̳߳����߳���Ŀ��"+executor.getPoolSize()+"�������еȴ�ִ�е�������Ŀ��"+
            executor.getQueue().size()+"����ִ������������Ŀ��"+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
