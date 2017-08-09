package com.huiy.designpattern.factorymethod;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
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
