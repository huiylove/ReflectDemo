package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class StaticDemo {

	public static void main(String[] args) {
        try {
        	//������  -- JVM���Ҳ�����ָ������
			Class<?> classType = Class.forName("com.huiy.javastatic.StaticTest");
			System.out.println("-----");
			
//	        Class.forName("com.huiy.javastatic.StaticTest",true,StaticDemo.class.getClassLoader());  
			//ʵ����-- �ഴ������Ĺ���
			StaticTest st = (StaticTest)classType.newInstance();
			StaticTest.show();
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
