package com.huiy.javareflect.proxy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��14��
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
