package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月8日
 * @version 1.0
 */
public class OutClass {
	
	private static String OutStaicVal = "静态属性"+System.currentTimeMillis();
	private String OutVal = "普通属性"+System.currentTimeMillis();
	
	 
	static{
		System.out.println("外部类的静态代码块");
	}
	
	{
		System.out.println("外部类的构造代码块");
	}
	
	public OutClass(){
		System.out.println("外部类的构造器");
	}
	
	public static class StaticInnerClass{
		
//		private static OutClass outClass = new OutClass();
//		
//		private static String innerStaicVal = "静态内部类的静态属性"+System.currentTimeMillis();
//		
//		{
//			System.out.println("静态内部类的构造代码块");
//		}
//		
		static{
			System.out.println("静态内部类的静态代码块");
		}
		
		public StaticInnerClass(){
			System.out.println("静态内部类的构造器");
		}

	}
	
     public class InnerClass{
		{
			System.out.println("内部类的构造代码块");
		}
		
		
		public InnerClass(){
			System.out.println("内部类的构造器");
		}
		
		public OutClass getOutClass(){
			return OutClass.this;
		}
	}
	
//	public static OutClass getInstance(){
//		System.out.print("外部类的静态方法");
//		return StaticInnerClass.outClass;
//	}
	
	
	public static void main(String[] args){
//		OutClass outClass = new OutClass();
//		OutClass.InnerClass innerClass = outClass.new InnerClass();

		OutClass.StaticInnerClass  staticInnerClass1 = new OutClass.StaticInnerClass();
		OutClass.StaticInnerClass  staticInnerClass2 = new OutClass.StaticInnerClass();
		
		StaticInnerClass  staticInnerClass3 = new StaticInnerClass();

//		getInstance();
//		getInstance();
	}		
}

