package com.huiy.designpattern.singleton;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月26日
 * @version 1.0
 *
 *
 */
public enum EnumSingleton {
	INSTANCE;  
    public EnumSingleton whateverMethod() {  
    	return EnumSingleton.INSTANCE;
    }  
}
