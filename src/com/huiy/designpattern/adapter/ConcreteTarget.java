package com.huiy.designpattern.adapter;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��1��
 * @version 1.0
 *
 *
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("��ͨ�� ���� ��ͨ����...");
	}

}
