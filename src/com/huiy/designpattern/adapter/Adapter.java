package com.huiy.designpattern.adapter;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��1��
 * @version 1.0
 *
 *
 */
//������������Ϊ Adapter ��ȼ̳��� Adaptee ���������ࣩ��Ҳʵ���� Target �ӿڣ���Ϊ Java ��֧�ֶ�̳У�����������ʵ�֣�
public class Adapter extends Adaptee implements Target {

	// �������࣬�̳��˱������࣬ͬʱʵ�ֱ�׼�ӿ� 
	@Override
	public void request() {
		super.specificRequest();

	}

}
