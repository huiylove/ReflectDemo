package com.huiy.designpattern.prototype;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class ConconcretePortotype2 implements Prototype {


	@Override
	public Prototype clone()  {
		Prototype propotype = new ConconcretePortotype2();
		return propotype;
	}

}
