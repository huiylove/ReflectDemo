package com.huiy.designpattern.abstractfactory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
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


