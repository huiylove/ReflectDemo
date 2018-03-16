package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月12日
 * @version 1.0
 */
public class B extends A {
	
	
	public static void staticMethod(){
		System.out.print("子类的静态方法");
	}
	
	public void privateMethod(){
		System.out.print("子类的私有方法");

	}
	
	public static void main(String[] args){
		A a = new B();
		B b = new B();
//		b.privateMethod();
		a.staticMethod();
	}
}
