package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public class Milk extends CondimentDecorator {  
	
    Beverage beverage;  
      
    public Milk(Beverage beverage){  
        this.beverage = beverage;  
    }  
      
    @Override  
    public String getDescription() {  
        return beverage.getDescription() + " , Milk";  
    }  
  
    @Override  
    public double cost() {  
        return beverage.cost() + 0.3;  
    }  
}  