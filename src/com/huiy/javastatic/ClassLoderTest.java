package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月12日
 * @version 1.0
 */

public class ClassLoderTest {
	public static void main(String[] args) {
		ClassloaderDemo demo = ClassloaderDemo.getInstance();
		System.out.println(demo.count1);
		System.out.println(demo.count2);
	}
}
