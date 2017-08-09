package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
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
