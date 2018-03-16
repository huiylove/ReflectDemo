package com.huiy.multithread.threadpool;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
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
        System.out.println(Thread.currentThread().getName()+"����ִ��task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"ִ�����");
    }
}
