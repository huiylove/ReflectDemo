package com.huiy.designpattern.decoratorexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class Bread extends Cake{
	
    public Bread(){  
    	this.description = "���";
    }  
	
	@Override
	public double cost() {
		return 3;
	}

}
