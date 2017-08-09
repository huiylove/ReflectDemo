package com.huiy.designpattern.factorymethod;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
 * @version 1.0
 *
 *
 */
public class AddFactory implements IFactory{

	@Override
	public Operate createOperate() {
		return new OperateAdd();
	}
}
