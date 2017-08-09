package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public abstract class Bird {
	private String name;  
	  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public abstract int fly();  
}
