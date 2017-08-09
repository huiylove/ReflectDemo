package com.huiy.designpattern.proxy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
 * @version 1.0
 *
 *
 */
public class RealSubject implements Subject{

	@Override
	public void show() {
		System.out.print("真实的展示");
	}

}
