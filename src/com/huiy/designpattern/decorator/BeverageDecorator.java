package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
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
