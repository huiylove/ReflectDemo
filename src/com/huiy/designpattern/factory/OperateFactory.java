package com.huiy.designpattern.factory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
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
