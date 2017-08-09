package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Egg extends CakeDecorator{

	
	public Egg(Cake cake,int count) {
		super(cake,count);
	}

	@Override
	public String getDescription() {  
	      return super.getDescription() + " ,"+this.getCount()+"个鸡蛋"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 1.5*this.getCount();
	}

}
