package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
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
