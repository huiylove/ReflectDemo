package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public abstract class Cake {
	
	protected String description = "Unknown Cake";  
	  
    public String getDescription() {  
        return description;  
    }  
  
    public abstract double cost();  
}
