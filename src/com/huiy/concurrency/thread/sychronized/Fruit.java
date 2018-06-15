package com.huiy.concurrency.thread.sychronized;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年11月17日
 * @version 1.0
 *
 *
 */
public class Fruit {
	public synchronized void eat(){
        System.out.println(Thread.currentThread().getName() +" run begin ");
		System.out.println("fruit taste good!");
        System.out.println(Thread.currentThread().getName() +" run end");

	}
	
}
