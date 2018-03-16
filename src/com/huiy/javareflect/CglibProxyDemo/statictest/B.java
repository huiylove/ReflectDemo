package com.huiy.javareflect.CglibProxyDemo.statictest;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月7日
 * @version 1.0
 */
public class B extends A {
	
	static{
		System.out.println("子类的静态代码块");
	}
	
	 public B(String arg){
		  System.out.println("子类的构造函数"+arg);
	 }
	  
	public static void readBook(){
		System.out.println("子类的静态方法");
	}
	
	
	public static void main(String[] args){
		A b = new B("11");
		b.printBookName("ee");
		readBook();//调用子类的静态
		b.readBook();//父类的静态方法
	}
	
}
