package com.huiy.javareflect.CglibProxyDemo.statictest;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��7��
 * @version 1.0
 */
public class B extends A {
	
	static{
		System.out.println("����ľ�̬�����");
	}
	
	 public B(String arg){
		  System.out.println("����Ĺ��캯��"+arg);
	 }
	  
	public static void readBook(){
		System.out.println("����ľ�̬����");
	}
	
	
	public static void main(String[] args){
		A b = new B("11");
		b.printBookName("ee");
		readBook();//��������ľ�̬
		b.readBook();//����ľ�̬����
	}
	
}
