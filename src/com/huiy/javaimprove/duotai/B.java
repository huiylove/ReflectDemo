package com.huiy.javaimprove.duotai;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class B extends A{
	 public String show(B obj){  
	        return ("B and B");  
	 }  
	      
     @Override
	public String show(A obj){  
        return ("B and A");  
     }   
}
