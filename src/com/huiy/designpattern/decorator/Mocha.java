package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
 * @version 1.0
 *
 *
 */
public class Mocha extends CondimentDecorator {  
	
	    Beverage beverage;  //ʵ������,��¼��װ�ε�����
	    
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

