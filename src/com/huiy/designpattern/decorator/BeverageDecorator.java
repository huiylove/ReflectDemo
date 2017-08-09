package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
 * @version 1.0
 *
 *
 */
public class BeverageDecorator extends Beverage{
	
	Beverage beverage ;
	
	public BeverageDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	
	@Override
	public String getDescription() {  
	      return beverage.getDescription();  
	 }  

	@Override
	public double cost() {
		return beverage.cost();
	}

}
