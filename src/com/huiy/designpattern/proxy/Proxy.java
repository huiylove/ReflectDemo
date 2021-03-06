package com.huiy.designpattern.proxy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
 * @version 1.0
 *
 *
 */
public class Proxy implements Subject{
	
	RealSubject rs;

	Proxy(){
		this.rs = new RealSubject();
	}
	
	@Override
	public void show() {
		System.out.println("实现方法前---");
		rs.show();
		System.out.println("实现方法后---");
	}

}
