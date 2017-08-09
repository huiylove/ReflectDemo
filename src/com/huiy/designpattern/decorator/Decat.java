package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public class Decat extends Beverage{
	
	public Decat(){  
	    description = "Decat";  
	}  
	      
	@Override  
	public double cost() {  
	    return 0.99;  
	}  
}
