package com.huiy.refactor.demo.eight15;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 *
 */
public abstract class Price {
	
	  static final int CHILDRENS = 2;//儿童片
	  static final int REGULAR = 0;//普通片
	  static final int NEW_RELEASE = 1;//新片
	
	  static Price newPrice(int code){
		 switch(code){
			case REGULAR : 
				return new RegularPrice();
			case CHILDRENS : 
				return new ChildrenPrice();
			case NEW_RELEASE : 
				return  new NewReleasePrice();
			default:throw new IllegalArgumentException("Incorrect Price Code");
		}
	 }
	  
	  
	 
	 abstract int getPriceCode();
	 abstract double getCharge(int daysRented);
	 abstract int getFrequentRenterPoints(int daysRented);
	
}
