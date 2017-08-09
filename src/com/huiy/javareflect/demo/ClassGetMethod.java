package com.huiy.javareflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��14��
 * @version 1.0
 *
 *
 */
public class ClassGetMethod {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//1.��ȡ���Class����
		Boolean var1 = true;
		Class<?> classType1 = var1.getClass();
		Class<?> classType2 = Boolean.class;
		Class<?> classType3 = Class.forName("java.lang.Boolean");
		Class<?> classType4 = Boolean.TYPE;//����ԭ������boolean

		System.out.println(classType1);
		System.out.println(classType2);
		System.out.println(classType3);		
		System.out.println(classType4);
		
		System.out.println();  

		//2.��ȡ���Fields
		Class<?> classType = ExtendType.class;
		System.out.println(classType.getField("name").get(classType));
		System.out.println(classType.getDeclaredMethod("getName").invoke(classType));
		

		//ʹ��getFields��ȡ����  
		Field[] fields = classType.getFields();  
		for (Field f : fields)  
		{  
		    System.out.println(f);  
		}  
		   
		System.out.println();  
		               
		//ʹ��getDeclaredFields��ȡ����  
		fields = classType.getDeclaredFields();  
		for (Field f : fields)  
		{  
		    System.out.println(f);  
		}  
		/* getFields���ص�������Ϊpublic�����ԣ����������ж��壬
		   getDeclaredFields���ص���ָ���ඨ������ж�������ԣ������������
		*/
		
		 System.out.println();  
		 
		 //3.��ȡ���Methods
		 Method[] methods = classType.getMethods();
		 for (Method m : methods)  
		 {  
			    System.out.println(m);  
		 } 
	
		 System.out.println();  
		 methods = classType.getDeclaredMethods();
		 for (Method m : methods)  
	     {  
		    System.out.println(m);  
	     } 

		 System.out.println();  
		 /* getMethods���ص�������Ϊpublic�ķ��������������ж��壬
		    getDeclaredMethods���ص���ָ���ඨ������ж���ķ����������������
		 */
		  
		 //4.��ȡ���Constructor
		 Constructor<?>[] constructors = classType.getConstructors();
		 for (Constructor<?> c : constructors)  
		 {  
			    System.out.println(c);  
		 } 
	
		 System.out.println();  
		 
		 constructors = classType.getDeclaredConstructors();
		 for (Constructor<?> c : constructors)  
	     {  
		    System.out.println(c);  
	     } 

		 System.out.println();  
		 
		 /* getConstructors���ص�������Ϊpublic�Ĺ��캯��
		    getDeclaredMethods���ص���ָ���ඨ������ж���Ĺ��캯��
		 */
		 
         //5.���������ʵ��	- ͨ���������
		 //�������Ա���ctor
		 Object inst = classType.newInstance();
		 System.out.println(inst);
		 System.out.println(); 
		 
		 Constructor<?> constructor1 = classType.getConstructor();
		 inst = constructor1.newInstance();
		 System.out.println(inst);
		 System.out.println(); 
		 
		 //���ô�����constructor
		 constructor1 = classType.getDeclaredConstructor(int.class,String.class);
		 inst = constructor1.newInstance(1,"1445");
		 System.out.println(inst);
		 System.out.println(); 
		 
		 //6.������ĺ���
		 inst = classType.newInstance();
		 Method logMethod = classType.getDeclaredMethod("Log",String.class);
		 logMethod.setAccessible(true);//��ȡ˽�����Ե�ʱ�����������AccessibleΪtrue
		 logMethod.invoke(inst, "���÷���");
		 System.out.println(); 

		 
		 //7.����/��ȡ�������ֵ
		 inst = classType.newInstance();
         Field intFiled = classType.getField("pubIntExtendField");
         intFiled.setInt(inst,589);
         int value = intFiled.getInt(inst);
		 System.out.println(value);
		 System.out.println(); 

		 inst = classType.getDeclaredConstructor(int.class,String.class).newInstance(899,"eseg");
		 Field strFiled = classType.getField("pubStringExtendField");
		 System.out.println(strFiled.get(inst));

		 
	}

}
