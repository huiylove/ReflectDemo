package com.huiy.designpattern.observeexam;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class EmailWarn implements Observer{
	
	@Override
	public void update() {
		System.out.println("�ʼ�Ԥ��");
	}

}
