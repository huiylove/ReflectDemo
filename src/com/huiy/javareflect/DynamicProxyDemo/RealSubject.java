package com.huiy.javareflect.DynamicProxyDemo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月15日
 * @version 1.0
 *
 *
 */
public class RealSubject implements Subject{

	@Override
	public void hello() {
		System.out.println("hello world!!!!");
	}

}
