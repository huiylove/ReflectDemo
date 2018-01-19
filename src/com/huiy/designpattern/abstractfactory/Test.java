package com.huiy.designpattern.abstractfactory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public class Test {
	
	public static void main(String[] args){
		PizzaStore ny = new NYPizzaStore();
		ny.orderPizza("cheese");
	}
	
}
