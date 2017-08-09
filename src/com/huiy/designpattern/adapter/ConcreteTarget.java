package com.huiy.designpattern.adapter;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月1日
 * @version 1.0
 *
 *
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("普通类 具有 普通功能...");
	}

}
