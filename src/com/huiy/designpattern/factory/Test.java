package com.huiy.designpattern.factory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operate oper = OperateFactory.createOperate(1);
		oper.setNumber1(5);
		oper.setNumber2(2);
		double result = oper.getResult();
		System.out.println(result);
	}

}
