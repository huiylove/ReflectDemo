package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public abstract class Beverage {
	
	    protected String description = "Unknown Beverage";  
	  
	    public String getDescription() {  
	        return description;  
	    }  
	  
	    public abstract double cost();  
}
