package com.huiy.concurrency.thread.semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 */
public class SemaphoreDemo {
	
    
    private void execute(){
    	//定义窗口个数
    	final Semaphore semaphore = new Semaphore(2);
    	//线程池
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	for(int i=1;i<=20;i++){
    		final int user = i;
//    		threadPool.execute(new SemaphoreRunnable(semaphore,i));
    		threadPool.execute(new Runnable(){
				@Override
				public void run() {
					try {
						//获取信号量
						semaphore.acquire();
						System.out.println("用户"+user+"正在窗口买票");
						Thread.sleep((long)Math.random()*10000);
						System.out.println("用户"+user+"买完票，准备离开");
						Thread.sleep((long)Math.random()*10000);
						System.out.println("用户"+user+"已经离开");
						//释放信号量
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
     * 执行任务类，获取信号量和释放信号量
     * @author user
     *
     */
    class SemaphoreRunnable implements Runnable{
    	
    	private Semaphore semaphore;
    	private int user;//记录几个用户
		
    	
    	public SemaphoreRunnable(Semaphore semaphore,int user){
    		this.semaphore = semaphore;
    		this.user = user;
    	}
    	
    	@Override
    	public void run() {
    		try {
    			//获取信号量许可
				semaphore.acquire();
				System.out.println("用户【"+user+"】进入窗口，准备买票");
				Thread.sleep((long)Math.random()*10000);
				System.out.println("用户【"+user+"】买票完成，即将离开");
				Thread.sleep((long)Math.random()*10000);
				System.out.println("用户【"+user+"】离开售票窗口");
				//释放信号量
				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    		
    	}
	}

	

}
