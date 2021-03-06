package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class StaticDemo {

	public static void main(String[] args) {
        try {
        	//加载类  -- JVM查找并加载指定的类
			Class<?> classType = Class.forName("com.huiy.javastatic.StaticTest");
			System.out.println("-----");
			
//	        Class.forName("com.huiy.javastatic.StaticTest",true,StaticDemo.class.getClassLoader());  
			//实例化-- 类创建对象的过程
			StaticTest st = (StaticTest)classType.newInstance();
			StaticTest.show();
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
