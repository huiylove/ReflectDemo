package com.huiy.designpattern.proxy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
 * @version 1.0
 *
 *
 */
public class RealSubject implements Subject{

	@Override
	public void show() {
		System.out.print("��ʵ��չʾ");
	}

}
