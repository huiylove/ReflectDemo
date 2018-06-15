package com.huiy.concurrency.thread.deadlock;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月15日
 * @version 1.0
 */
public class ThreadA implements Runnable{
	private DeadLockDemo deadlockdemo;
	
	public ThreadA(DeadLockDemo deadlockdemo){
		this.deadlockdemo = deadlockdemo;
	}

	@Override
	public void run() {
		deadlockdemo.mothodA();
	}

}
