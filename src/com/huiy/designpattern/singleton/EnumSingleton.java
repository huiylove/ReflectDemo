package com.huiy.designpattern.singleton;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��26��
 * @version 1.0
 *
 *
 */
public enum EnumSingleton {
	INSTANCE;  
	
    public static EnumSingleton whateverMethod() {  
    	return EnumSingleton.INSTANCE;
    }  
    
    public void EnumPrint(){
    	System.out.println("ddd");
    }
}
