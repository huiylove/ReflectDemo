package com.huiy.javareflect.CglibProxyDemo.statictest;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��7��
 * @version 1.0
 */
public class A {
	
	static{
		System.out.println("����ľ�̬�����");
	}
	
	  public A(){
		  System.out.println("����Ĺ��캯��");
	  }
	  
	  public void addBook(){
		   System.out.println("����ͼ��....");
	   }
	   
	   public static void readBook(){
		   System.out.println("��ͼ��....");
	   }
	   
	   public final void printBookName(String name){
		   System.out. println(name);
	   }
}
