package com.huiy.springioc;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月29日
 * @version 1.0
 *
 *
 */
public class MyThread extends Thread{
	
	private int taskNum;
	
	MyThread(int num){
		taskNum = num;
	}
	
	
 	@Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行任务"+taskNum);
        try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+"被中断");
			this.interrupt();
			e.printStackTrace();
		}finally{
		}
        System.out.println(Thread.currentThread().getName() + "执行任务完成");

    }
}
