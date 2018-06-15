package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��8��
 * @version 1.0
 */
public class OutClass {
	
	private static String OutStaicVal = "��̬����"+System.currentTimeMillis();
	private String OutVal = "��ͨ����"+System.currentTimeMillis();
	
	 
	static{
		System.out.println("�ⲿ��ľ�̬�����");
	}
	
	{
		System.out.println("�ⲿ��Ĺ�������");
	}
	
	public OutClass(){
		System.out.println("�ⲿ��Ĺ�����");
	}
	
	public static class StaticInnerClass{
		
//		private static OutClass outClass = new OutClass();
//		
//		private static String innerStaicVal = "��̬�ڲ���ľ�̬����"+System.currentTimeMillis();
//		
//		{
//			System.out.println("��̬�ڲ���Ĺ�������");
//		}
//		
		static{
			System.out.println("��̬�ڲ���ľ�̬�����");
		}
		
		public StaticInnerClass(){
			System.out.println("��̬�ڲ���Ĺ�����");
		}

	}
	
     public class InnerClass{
		{
			System.out.println("�ڲ���Ĺ�������");
		}
		
		
		public InnerClass(){
			System.out.println("�ڲ���Ĺ�����");
		}
		
		public OutClass getOutClass(){
			return OutClass.this;
		}
	}
	
//	public static OutClass getInstance(){
//		System.out.print("�ⲿ��ľ�̬����");
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

