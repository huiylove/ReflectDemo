package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��4��12��
 * @version 1.0
 */

public class ClassLoderTest {
	public static void main(String[] args) {
		ClassloaderDemo demo = ClassloaderDemo.getInstance();
		System.out.println(demo.count1);
		System.out.println(demo.count2);
	}
}
