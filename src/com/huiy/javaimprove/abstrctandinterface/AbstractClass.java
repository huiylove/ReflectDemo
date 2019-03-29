package com.huiy.javaimprove.abstrctandinterface;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public abstract class AbstractClass {
	
   int a = 10;
   
   public AbstractClass(){
	  a = 11;
   }
   
   public AbstractClass(int X){
		  a = X;
   }
   
	
   public abstract  void  A();
   
   protected abstract  void  B();
   
   
}
