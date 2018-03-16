package com.huiy.javaimprove.duotai;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
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
