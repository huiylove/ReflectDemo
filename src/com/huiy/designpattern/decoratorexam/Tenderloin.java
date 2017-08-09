package com.huiy.designpattern.decoratorexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
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
	      return super.getDescription() + " ,"+this.getCount()+"���Ｙ"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 3.5*this.getCount();
	}

}
