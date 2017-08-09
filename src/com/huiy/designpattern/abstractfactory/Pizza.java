package com.huiy.designpattern.abstractfactory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public abstract class Pizza {
	protected  String name;
	
//	 public void prepare() {  
//	        System.out.println("Preparing "+name);  
//	        System.out.println("Tossing dough");  
//	        System.out.println("Adding sause");  
//	        System.out.println("Adding toppings");  
//	 }  
	public abstract void prepare();
}
