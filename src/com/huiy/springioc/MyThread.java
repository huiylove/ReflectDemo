package com.huiy.springioc;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
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
        System.out.println(Thread.currentThread().getName() + "����ִ������"+taskNum);
        try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+"���ж�");
			this.interrupt();
			e.printStackTrace();
		}finally{
		}
        System.out.println(Thread.currentThread().getName() + "ִ���������");

    }
}
