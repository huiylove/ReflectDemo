package com.huiy.concurrency.thread.deadlock;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��15��
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
