package com.huiy.concurrency;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��5��
 * @version 1.0
 */
public class TestThread {

		public static void main(String[] args) { 
			   TxtThread tt = new TxtThread(); 
			   new Thread(tt).start(); 
			   new Thread(tt).start(); 
			   new Thread(tt).start(); 
			   new Thread(tt).start(); 
		} 
}
