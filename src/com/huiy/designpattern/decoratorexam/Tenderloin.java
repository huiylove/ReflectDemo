package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Tenderloin extends CakeDecorator{

	public Tenderloin(Cake cake,int count) {
		super(cake,1);
	}
	
	@Override
	public String getDescription() {  
	      return super.getDescription() + " ,"+this.getCount()+"个里脊"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 3.5*this.getCount();
	}

}
