package com.huiy.javaimprove.abstrctandinterface;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public abstract class Animal implements ActionInterface{
   public abstract void cry();  
   
   public void sleep(){
	   System.out.println("˯��");
   }
}
