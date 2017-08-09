package com.huiy.designpattern.factorymethod;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
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
