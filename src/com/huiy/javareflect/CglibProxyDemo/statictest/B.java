package com.huiy.javareflect.CglibProxyDemo.statictest;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��7��
 * @version 1.0
 */
public class B extends A {
	
	private static int value = 1;
	
	static{
		System.out.println("子类的静态代码块");
		System.out.println(value);

	}
	
	public B(){
		value++;
	}
	
	 public B(String arg){
		  System.out.println("子类的有参构造函数"+arg);
	 }
	  
//	public static void readBook(){
//		System.out.println("子类读图书....");
//	}
	
	
	public static void main(String[] args){
		A b = new B();
//		A b = new B("11");
//		b.printBookName("ee");
		readBook();//��������ľ�̬
//		b.readBook();//����ľ�̬����
	}
	
}
