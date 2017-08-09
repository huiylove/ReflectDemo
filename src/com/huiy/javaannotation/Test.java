package com.huiy.javaannotation;

import java.lang.reflect.Method;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月17日
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		 try {
//			// 使用类加载器加载类
			Class c = Class.forName("com.huiy.javaannotation.Child");
			 // 找到类上面的注解
			 boolean isExist = c.isAnnotationPresent(Description.class);
			 // 上面的这个方法是用这个类来判断这个类是否存在Description这样的一个注解
			 if (isExist) {
			     // 拿到注解实例，解析类上面的注解
			     Description d = (Description) c.getAnnotation(Description.class);
			     System.out.println(d.value());
			 }
			 
			//获取所有的方法
			 Method[] ms = c.getMethods();
			 // 遍历所有的方法
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
