package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
 * @version 1.0
 *
 *
 */
public class StarbuzzCoffee {  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        Beverage beverage = new DarkRoast();  
        System.out.println(beverage.getDescription() + " $" + beverage.cost());  
          
        Beverage beverage2 = new DarkRoast();  
//        beverage2 = new Mocha(beverage2);  
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());     
//        beverage2 = new Mocha(beverage2);  
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());     
        beverage2 = new Milk(beverage2);  
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());    
        
//        Beverage beverage1 = new DarkRoast();  
        Beverage beverage1 = new Milk1(new DarkRoast());
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());  

        
    }  
  
}  
