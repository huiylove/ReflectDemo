package com.huiy.concurrency.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 * 
 * 业务场景：聚餐吃饭
 * 公司周末聚餐，到同一地点吃饭，全员到齐之后，才开始吃饭（同步点）
 * 假如人没到齐，先到的人只能等待（阻塞），直到人都到齐才开始吃饭
 * 
 * CyclicBarrier 可循环的障碍物   
 * 多线程执行完之后，最后合并结果
 */
public class CyclicBarrierDemo {
	
	
	
	public static void main(String[] args) {
		//3个人一起聚餐
		final CyclicBarrier cb = new CyclicBarrier(3,()->{
			System.out.println("人员全部到齐之后，全部拍照留恋");
		}
//		new Runnable(){
//
//			@Override
//			public void run() {
//				System.out.println("人员全部到齐之后，全部拍照留恋");
//			}
//		}
		);
		
		
		//线程池
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	for(int i=0;i<3;i++){
    		final int user = i+1;
    		threadPool.execute(new Runnable(){
				@Override
				public void run() {
					try {
						//模拟每个人到达时间不一样
						Thread.sleep((long)Math.random()*10000);
						System.out.println(user+"达到聚餐点,当前已有，"+(cb.getNumberWaiting()+1)+"达到");
						//阻塞
						cb.await(); 
						
//						if(user==3){//不加此条件判断，每个人都会执行一遍
							System.out.println("拍照结束，开始吃饭");
//						}
						
						Thread.sleep((long)Math.random()*10000);
						System.out.println(user+"吃完饭了，准备回家");

					} catch (InterruptedException |BrokenBarrierException e1) {
						e1.printStackTrace();
					}
				}
    			
    		});
    	}
    	threadPool.shutdown();

	}

}
