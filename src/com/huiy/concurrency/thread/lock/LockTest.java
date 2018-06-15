package com.huiy.concurrency.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月10日
 * @version 1.0
 */
public class LockTest {
	
	    private Lock lock = new ReentrantLock();
	    
        public static LockTest lockTest = new LockTest();


	    //需要参与同步的方法
	    private void method(Thread thread){
//	        lock.lock();
//	        try {
//	            System.out.println("线程名"+thread.getName() + "获得了锁");
//	        }catch(Exception e){
//	            e.printStackTrace();
//	        } finally {
//	            System.out.println("线程名"+thread.getName() + "释放了锁");
//	            lock.unlock();
//	        }
	        if(lock.tryLock()){
	            try {
	                System.out.println("线程名"+thread.getName() + "获得了锁");
	            }catch(Exception e){
	                e.printStackTrace();
	            } finally {
	                System.out.println("线程名"+thread.getName() + "释放了锁");
	                lock.unlock();
	            }
	        }else{
	            System.out.println("我是"+Thread.currentThread().getName()+"有人占着锁，我就不要啦");
	        }	        
	    }

	    public static void main(String[] args) {

	        //线程1
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
