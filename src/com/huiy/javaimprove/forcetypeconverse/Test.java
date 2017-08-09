package com.huiy.javaimprove.forcetypeconverse;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *在继承中，子类可以自动转型为父类，
 *但是父类强制转换为子类时只有当引用类型真正的身份为子类时才会强制转换成功，否则失败
 *
 */
public class Test {
	public static void main(String[] args) {  
		Object[] objArr = new String[]{"a"};//new Object[]{"a","b","c"};
		String [] strArr = (String[]) objArr;
		System.out.println(strArr.getClass());
    }  
  
}
