package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��12��
 * @version 1.0
 */
public class B extends A {
	
	
	public static void staticMethod(){
		System.out.print("����ľ�̬����");
	}
	
	public void privateMethod(){
		System.out.print("�����˽�з���");

	}
	
	public static void main(String[] args){
		A a = new B();
		B b = new B();
//		b.privateMethod();
		a.staticMethod();
	}
}
