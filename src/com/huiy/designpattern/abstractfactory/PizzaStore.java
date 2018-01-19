package com.huiy.designpattern.abstractfactory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public abstract class PizzaStore {
	
    public Pizza orderPizza(String type){  
    	Pizza pizza;  
        pizza = createPizza(type);  
          
        pizza.prepare();  
        return pizza;
    }
    
    public abstract Pizza createPizza(String type);	

}


