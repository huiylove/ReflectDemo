package com.huiy.designpattern.decoratorexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class HotDog extends CakeDecorator{

	public HotDog(Cake cake,int count) {
		super(cake,1);
	}
	
	@Override
	public String getDescription() {  
	      return super.getDescription() + " ,"+this.getCount()+"���ȹ�"; 
	 }  

	@Override
	public double cost() {
		return super.cost()+ 2*this.getCount();
	}

}
