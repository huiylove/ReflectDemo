package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
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
