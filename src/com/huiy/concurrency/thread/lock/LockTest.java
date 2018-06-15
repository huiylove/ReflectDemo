package com.huiy.concurrency.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��4��10��
 * @version 1.0
 */
public class LockTest {
	
	    private Lock lock = new ReentrantLock();
	    
        public static LockTest lockTest = new LockTest();


	    //��Ҫ����ͬ���ķ���
	    private void method(Thread thread){
//	        lock.lock();
//	        try {
//	            System.out.println("�߳���"+thread.getName() + "�������");
//	        }catch(Exception e){
//	            e.printStackTrace();
//	        } finally {
//	            System.out.println("�߳���"+thread.getName() + "�ͷ�����");
//	            lock.unlock();
//	        }
	        if(lock.tryLock()){
	            try {
	                System.out.println("�߳���"+thread.getName() + "�������");
	            }catch(Exception e){
	                e.printStackTrace();
	            } finally {
	                System.out.println("�߳���"+thread.getName() + "�ͷ�����");
	                lock.unlock();
	            }
	        }else{
	            System.out.println("����"+Thread.currentThread().getName()+"����ռ�������ҾͲ�Ҫ��");
	        }	        
	    }

	    public static void main(String[] args) {

	        //�߳�1
	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                lockTest.method(Thread.currentThread());
	            }
	        }, "t1");

	        Thread t2 = new Thread(new Runnable() {

	            @Override
	            public void run() {
	                lockTest.method(Thread.currentThread());
	            }
	        }, "t2");

	        t2.start();
	        t1.start();
	    }
	}
