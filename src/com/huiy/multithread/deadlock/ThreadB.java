package com.huiy.multithread.deadlock;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月15日
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
