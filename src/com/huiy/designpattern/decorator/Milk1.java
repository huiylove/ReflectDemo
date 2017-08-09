package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
 * @version 1.0
 *
 *
 */
public class Milk1 extends BeverageDecorator {  
	
    public Milk1(Beverage beverage){  
    	super(beverage);
    }  
      
    @Override  
    public String getDescription() {  
        return super.getDescription() + " , Milk";  
    }  
  
    @Override  
    public double cost() {  
        return super.cost() + 0.3;  
    }  
}  