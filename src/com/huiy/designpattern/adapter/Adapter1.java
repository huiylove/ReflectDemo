package com.huiy.designpattern.adapter;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��1��
 * @version 1.0
 *
 *
 */
//���������� ������ʹ�ö�̳л�̳���ʵ�ֵķ�ʽ������ʹ��ֱ�ӹ��������߳�Ϊί�еķ�ʽ
public class Adapter1 implements Target {
	
	Adaptee adaptee;
	
	public Adapter1(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	// �������࣬�̳��˱������࣬ͬʱʵ�ֱ�׼�ӿ� 
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
