package com.huiy.designpattern.decorator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��28��
 * @version 1.0
 *
 *
 */
public class Decat extends Beverage{
	
	public Decat(){  
	    description = "Decat";  
	}  
	      
	@Override  
	public double cost() {  
	    return 0.99;  
	}  
}
