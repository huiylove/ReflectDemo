package com.huiy.designpattern.abstractfactory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
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
