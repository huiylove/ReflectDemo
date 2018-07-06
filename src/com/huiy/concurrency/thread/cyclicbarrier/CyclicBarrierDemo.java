package com.huiy.concurrency.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��15��
 * @version : 1.0
 * 
 * ҵ�񳡾����۲ͳԷ�
 * ��˾��ĩ�۲ͣ���ͬһ�ص�Է���ȫԱ����֮�󣬲ſ�ʼ�Է���ͬ���㣩
 * ������û���룬�ȵ�����ֻ�ܵȴ�����������ֱ���˶�����ſ�ʼ�Է�
 * 
 * CyclicBarrier ��ѭ�����ϰ���   
 * ���߳�ִ����֮�����ϲ����
 */
public class CyclicBarrierDemo {
	
	
	
	public static void main(String[] args) {
		//3����һ��۲�
		final CyclicBarrier cb = new CyclicBarrier(3,new Runnable(){

			@Override
			public void run() {
				System.out.println("��Աȫ������֮��ȫ����������");
			}
		});
		
		
		//�̳߳�
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	for(int i=0;i<3;i++){
    		final int user = i+1;
    		threadPool.execute(new Runnable(){
				@Override
				public void run() {
					try {
						//ģ��ÿ���˵���ʱ�䲻һ��
						Thread.sleep((long)Math.random()*10000);
						System.out.println(user+"�ﵽ�۲͵�,��ǰ���У�"+(cb.getNumberWaiting()+1)+"�ﵽ");
						//����
						cb.await(); 
						
//						if(user==3){//���Ӵ������жϣ�ÿ���˶���ִ��һ��
							System.out.println("���ս�������ʼ�Է�");
//						}
						
						Thread.sleep((long)Math.random()*10000);
						System.out.println(user+"���극�ˣ�׼���ؼ�");

					} catch (InterruptedException |BrokenBarrierException e1) {
						e1.printStackTrace();
					}
				}
    			
    		});
    	}
    	threadPool.shutdown();

	}

}
