package com.huiy.concurrency.thread.Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��15��
 * @version : 1.0
 * �����̵߳�ͬһ���㣨�����㣩��������
 * 1�������߳̽�������
 * 2��У�Թ���
 */
public class ExchangerDemo {

	public static void main(String[] args) {
		//������ ����String��������
		final Exchanger<String> ec = new Exchanger<String>();
		
		//�̳߳�
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	//����Ż�
    	threadPool.execute(new Runnable(){
				@Override
				public void run(){
					String returnStr;
					try {
						Thread.sleep((long)Math.random()*10000);
						returnStr = ec.exchange("С��");
						System.out.println("������С�ǽ�����  "+returnStr);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
    	});
    	
    	//����
    	threadPool.execute(new Runnable(){
			@Override
			public void run(){
				String returnStr;
				try {
					Thread.sleep((long)Math.random()*10000);
					returnStr = ec.exchange("һǧ��");
					System.out.println("������һǧ�򽻻���  "+returnStr);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	    });
    	
    	threadPool.shutdown();
		
	}

}
