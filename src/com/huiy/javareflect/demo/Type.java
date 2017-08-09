package com.huiy.javareflect.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��14��
 * @version 1.0
 *
 *
 */
public class Type {
	public int pubIntField;  
    public String pubStringField;  
    private int prvIntField;  
       
    public Type(){  
        Log("Default Constructor");  
    }  
       
    Type(int arg1, String arg2){  
        pubIntField = arg1;  
        pubStringField = arg2;  
           
        Log("Constructor with parameters");  
    }  
       
    public void setIntField(int val) {  
        this.prvIntField = val;  
    }  
    public int getIntField() {  
        return prvIntField;  
    }  
       
    private void Log(String msg){  
        System.out.println("Type:" + msg);  
    }  
}  
