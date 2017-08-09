package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public class HouseBlend extends Beverage {  
	  
    public HouseBlend(){  
        description = "HouseBlend";  
    }  
      
    @Override  
    public double cost() {  
        return 0.89;  
    }  
  
}  