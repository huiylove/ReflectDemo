package com.huiy.concurrency;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
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
