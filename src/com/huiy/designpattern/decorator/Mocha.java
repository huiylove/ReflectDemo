package com.huiy.designpattern.decorator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月28日
 * @version 1.0
 *
 *
 */
public class Mocha extends CondimentDecorator {  
	
	    Beverage beverage;  //实例变量,记录所装饰的事务
	    
	    public Mocha(Beverage beverage){  
	        this.beverage = beverage;  
	    }  
	      
	    @Override  
	    public String getDescription() {  
	        return beverage.getDescription() + " , Mocha";  
	    }  
	  
	    @Override  
	    public double cost() {  
	        return beverage.cost() + 0.20;  
	    }  
	  
}  

