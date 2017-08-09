package com.huiy.designpattern.abstractfactory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 *
 *
 */
public class NYStylesPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if("cheeze".equals(type)){
			return new NYStyleCheesePizza();
		}
		return null;
	}

}
