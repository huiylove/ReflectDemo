package com.huiy.javaimprove.abstrctandinterface;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *  ��ʵ�ֶ�ӿڵ�ʱ��һ��Ҫ���ⷽ�������ظ���
 *
 */
public class Cat extends Animal implements ActionInterface1{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è�Զ���eeeeee");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("è��ddddd");
	}

}
