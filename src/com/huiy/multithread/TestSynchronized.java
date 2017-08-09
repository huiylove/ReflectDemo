package com.huiy.multithread;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class TestSynchronized {
	public static void main(String[] args) {
//        Example example = new Example();
//        MyThread thread1 = new MyThread(example);
//        Example example1 = new Example();
//        MyThread1 thread2 = new MyThread1(example1);
//        thread1.start();
//        thread2.start();
		  Object object = new Object();
		  Object object1 = new Object();
          Example2 example = new Example2(object);
          Example2 example1 = new Example2(object1);

          MyThread2 thread1 = new MyThread2(example);
          MyThread2 thread2 = new MyThread2(example1);
          thread1.start();
          thread2.start();
    }
}
