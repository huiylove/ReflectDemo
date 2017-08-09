package com.huiy.designpattern.decoratorexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
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
