package com.huiy.designpattern.prototype;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class ConconcretePortotype2 implements Prototype {


	@Override
	public Prototype clone()  {
		Prototype propotype = new ConconcretePortotype2();
		return propotype;
	}

}
