package com.huiy.javaimprove.staticdemo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public class Test {
	 public static void main(String[] args) {  
	        StaticTest StaticTest1 = new StaticTest();  
	        StaticTest StaticTest2 = new StaticTest();  
	          
	        System.out.println("StaticTest1 count：" + StaticTest.count);  
	        System.out.println("StaticTest2 count：" + StaticTest.count);  
	    }  
}
