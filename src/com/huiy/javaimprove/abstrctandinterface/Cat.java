package com.huiy.javaimprove.abstrctandinterface;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *  在实现多接口的时候一定要避免方法名的重复。
 *
 */
public class Cat extends Animal implements ActionInterface1{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃东西eeeeee");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("猫叫ddddd");
	}

}
