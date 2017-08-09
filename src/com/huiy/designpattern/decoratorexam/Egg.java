package com.huiy.designpattern.decoratorexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
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
	      return super.getDescription() + " ,"+this.getCount()+"������"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 1.5*this.getCount();
	}

}
