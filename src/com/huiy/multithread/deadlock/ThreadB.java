package com.huiy.multithread.deadlock;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��15��
 * @version 1.0
 */
public class ThreadB implements Runnable{
	private DeadLockDemo deadlockdemo;
	
	public ThreadB(DeadLockDemo deadlockdemo){
		this.deadlockdemo = deadlockdemo;
	}

	@Override
	public void run() {
		deadlockdemo.mothodB();
	}

}
