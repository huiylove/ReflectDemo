package com.huiy.designpattern.factorymethod;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 *
 *
 */
public class OperateAdd extends Operate{

	@Override
	public double getResult() {
		return getNumber1()+getNumber2();
	}

}
