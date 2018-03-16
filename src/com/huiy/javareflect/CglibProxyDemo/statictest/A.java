package com.huiy.javareflect.CglibProxyDemo.statictest;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月7日
 * @version 1.0
 */
public class A {
	
	static{
		System.out.println("父类的静态代码块");
	}
	
	  public A(){
		  System.out.println("父类的构造函数");
	  }
	  
	  public void addBook(){
		   System.out.println("新增图书....");
	   }
	   
	   public static void readBook(){
		   System.out.println("读图书....");
	   }
	   
	   public final void printBookName(String name){
		   System.out. println(name);
	   }
}
