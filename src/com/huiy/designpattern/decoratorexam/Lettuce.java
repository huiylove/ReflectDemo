package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Lettuce extends CakeDecorator{
	
	public Lettuce(Cake cake,int count) {
		super(cake,count);
	}
	
	@Override
	public String getDescription() {  
	      return super.getDescription() + " ,"+this.getCount()+"个生菜"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 0;
	}

}
