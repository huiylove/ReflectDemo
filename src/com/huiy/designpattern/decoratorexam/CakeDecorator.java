package com.huiy.designpattern.decoratorexam;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class CakeDecorator extends Cake{
	
    
	Cake cake ;
	private int count;

	
	public CakeDecorator(Cake cake,int count){
		this.cake = cake;
		this.count = count;
	}
	
	@Override
	public String getDescription() {  
	      return cake.getDescription();  
	 }  

	@Override
	public double cost() {
		return cake.cost();
	}
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}

}
