package com.huiy.javareflect.DynamicProxyDemo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��15��
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
