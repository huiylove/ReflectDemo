package com.huiy.javaimprove.abstrctandinterface;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public abstract class Animal implements ActionInterface{
   public abstract void cry();  
   
   public void sleep(){
	   System.out.println("睡觉");
   }
}
