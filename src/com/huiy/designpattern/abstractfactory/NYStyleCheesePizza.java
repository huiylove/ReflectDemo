package com.huiy.designpattern.abstractfactory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public class NYStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;  
	
	NYStyleCheesePizza(){
		this.name = "Ny Style Sauce and Cheese Pizza";  
	}
	
	/* 
     * 要制作披萨必须要有制作披萨的原料，而这些原料是从原料工厂运来的 
     */  
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory){  
        this.ingredientFactory = ingredientFactory;  
        prepare();  
    }  
	
    /** 
     * 实现prepare方法 
     * prepare 方法一步一步地创建芝士比萨，每当需要原料时，就跟工厂要 
     */  
    public void prepare() {  
        System.out.println("Prepareing " + name);
        //调用工厂的方法
        
    }  
}
