package com.huiy.javaannotation;

import java.lang.reflect.Method;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��17��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		 try {
//			// ʹ���������������
			Class c = Class.forName("com.huiy.javaannotation.Child");
			 // �ҵ��������ע��
			 boolean isExist = c.isAnnotationPresent(Description.class);
			 // ������������������������ж�������Ƿ����Description������һ��ע��
			 if (isExist) {
			     // �õ�ע��ʵ���������������ע��
			     Description d = (Description) c.getAnnotation(Description.class);
			     System.out.println(d.value());
			 }
			 
			//��ȡ���еķ���
			 Method[] ms = c.getMethods();
			 // �������еķ���
			 for (Method m : ms) {
			     boolean isExist1 = m.isAnnotationPresent(Description.class);
			     if (isExist1) {
			    	 System.out.println(m.getName());
			         Description d1 = m.getAnnotation(Description.class);
			         System.out.println(d1.value());
			     }
			 }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
