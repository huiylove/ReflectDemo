package com.huiy.multithread.threadpool;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月29日
 * @version 1.0
 *
 *
 */
public class MyTask implements Runnable {
	
    private int taskNum;
     
    public MyTask(int num) {
        this.taskNum = num;
    }
     
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
