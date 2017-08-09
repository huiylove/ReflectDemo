package com.huiy.javareflect.proxy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月14日
 * @version 1.0
 *
 *
 */
public class RealSubject implements Subject{
	
	 @Override
     public String say(String name, int age) {
         return name + "  " + age;
     }
}
