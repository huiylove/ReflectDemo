package com.huiy.designpattern.prototype;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 * ����ԭ�Ͷ���
 */
public class ConconcretePortotype1 implements Prototype {

	@Override
	public Prototype clone(){
		Prototype propotype = new ConconcretePortotype1();
		return propotype;
	}


}
