package com.huiy.designpattern.abstractfactory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
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
