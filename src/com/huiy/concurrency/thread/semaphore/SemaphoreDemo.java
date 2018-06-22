package com.huiy.concurrency.thread.semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��15��
 * @version : 1.0
 */
public class SemaphoreDemo {
	
    
    private void execute(){
    	//���崰�ڸ���
    	final Semaphore semaphore = new Semaphore(2);
    	//�̳߳�
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	for(int i=1;i<=20;i++){
    		final int user = i;
//    		threadPool.execute(new SemaphoreRunnable(semaphore,i));
    		threadPool.execute(new Runnable(){
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println("�û�"+user+"���ڴ�����Ʊ");
						Thread.sleep((long)Math.random()*10000);
						System.out.println("�û�"+user+"����Ʊ��׼���뿪");
						Thread.sleep((long)Math.random()*10000);
						System.out.println("�û�"+user+"�Ѿ��뿪");
						semaphore.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
    			
    		});
    	}
    	threadPool.shutdown();
    }

	public static void main(String[] args) {
		SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
		semaphoreDemo.execute();
	}
	
	  /**
     * ִ�������࣬��ȡ�ź������ͷ��ź���
     * @author user
     *
     */
    class SemaphoreRunnable implements Runnable{
    	
    	private Semaphore semaphore;
    	private int user;//��¼�����û�
		
    	
    	public SemaphoreRunnable(Semaphore semaphore,int user){
    		this.semaphore = semaphore;
    		this.user = user;
    	}
    	
    	@Override
    	public void run() {
    		try {
    			//��ȡ�ź������
				semaphore.acquire();
				System.out.println("�û���"+user+"�����봰�ڣ�׼����Ʊ");
				Thread.sleep((long)Math.random()*10000);
				System.out.println("�û���"+user+"����Ʊ��ɣ������뿪");
				Thread.sleep((long)Math.random()*10000);
				System.out.println("�û���"+user+"���뿪��Ʊ����");
				//�ͷ��ź���
				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    		
    	}
	}

	

}
