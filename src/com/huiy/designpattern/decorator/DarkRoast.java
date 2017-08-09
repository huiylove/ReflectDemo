package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public class DarkRoast extends Beverage {  
	
    public DarkRoast(){  
        description = "DarkRoast";  
    } 
    
    @Override  
    public double cost() {  
        return 1.05;  
    }  
  
}  
