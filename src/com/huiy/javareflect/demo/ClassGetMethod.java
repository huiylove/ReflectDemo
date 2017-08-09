package com.huiy.javareflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月14日
 * @version 1.0
 *
 *
 */
public class ClassGetMethod {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//1.获取类的Class对象
		Boolean var1 = true;
		Class<?> classType1 = var1.getClass();
		Class<?> classType2 = Boolean.class;
		Class<?> classType3 = Class.forName("java.lang.Boolean");
		Class<?> classType4 = Boolean.TYPE;//返回原生类型boolean

		System.out.println(classType1);
		System.out.println(classType2);
		System.out.println(classType3);		
		System.out.println(classType4);
		
		System.out.println();  

		//2.获取类的Fields
		Class<?> classType = ExtendType.class;
		System.out.println(classType.getField("name").get(classType));
		System.out.println(classType.getDeclaredMethod("getName").invoke(classType));
		

		//使用getFields获取属性  
		Field[] fields = classType.getFields();  
		for (Field f : fields)  
		{  
		    System.out.println(f);  
		}  
		   
		System.out.println();  
		               
		//使用getDeclaredFields获取属性  
		fields = classType.getDeclaredFields();  
		for (Field f : fields)  
		{  
		    System.out.println(f);  
		}  
		/* getFields返回的是申明为public的属性，包括父类中定义，
		   getDeclaredFields返回的是指定类定义的所有定义的属性，不包括父类的
		*/
		
		 System.out.println();  
		 
		 //3.获取类的Methods
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
		 /* getMethods返回的是申明为public的方法，包括父类中定义，
		    getDeclaredMethods返回的是指定类定义的所有定义的方法，不包括父类的
		 */
		  
		 //4.获取类的Constructor
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
		 
		 /* getConstructors返回的是申明为public的构造函数
		    getDeclaredMethods返回的是指定类定义的所有定义的构造函数
		 */
		 
         //5.创建新类的实例	- 通过反射机制
		 //调用无自变量ctor
		 Object inst = classType.newInstance();
		 System.out.println(inst);
		 System.out.println(); 
		 
		 Constructor<?> constructor1 = classType.getConstructor();
		 inst = constructor1.newInstance();
		 System.out.println(inst);
		 System.out.println(); 
		 
		 //调用带参数constructor
		 constructor1 = classType.getDeclaredConstructor(int.class,String.class);
		 inst = constructor1.newInstance(1,"1445");
		 System.out.println(inst);
		 System.out.println(); 
		 
		 //6.调用类的函数
		 inst = classType.newInstance();
		 Method logMethod = classType.getDeclaredMethod("Log",String.class);
		 logMethod.setAccessible(true);//获取私有属性的时候必须先设置Accessible为true
		 logMethod.invoke(inst, "调用方法");
		 System.out.println(); 

		 
		 //7.设置/获取类的属性值
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
