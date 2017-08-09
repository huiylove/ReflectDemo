package com.huiy.designpattern.factory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public class OperateFactory {
	public static Operate createOperate(int operate){
		Operate oper = null;
		switch(operate){
			case 1: 
				oper = new OperateAdd();
				break;
		}
		return oper;
	}
}
