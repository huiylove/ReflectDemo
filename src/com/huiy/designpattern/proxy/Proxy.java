package com.huiy.designpattern.proxy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
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
		rs.show();
	}

}
