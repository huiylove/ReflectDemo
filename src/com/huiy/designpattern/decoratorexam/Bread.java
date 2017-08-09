package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Bread extends Cake{
	
    public Bread(){  
    	this.description = "面饼";
    }  
	
	@Override
	public double cost() {
		return 3;
	}

}
