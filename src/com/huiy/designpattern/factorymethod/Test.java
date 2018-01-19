package com.huiy.designpattern.factorymethod;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new AddFactory();
		Operate operate = factory.createOperate();
		operate.setNumber1(1);
		operate.setNumber2(2);
		System.out.println(operate.getResult());

	}

}
