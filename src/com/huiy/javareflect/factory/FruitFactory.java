package com.huiy.javareflect.factory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��15��
 * @version 1.0
 * ���÷�����ƹ���������
 *
 */
public class FruitFactory {
	
   public static  Fruit getInstance(String fruitClassName){
	    Fruit f = null;
	    try {
			 f = (Fruit)Class.forName(fruitClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return f;

   }
   
   public static void main(String[] args){
	   Fruit f  = FruitFactory.getInstance("com.huiy.javareflect.factory.Orange");;
	   if(f!=null){
		   f.eat();
	   }
	   
   }
}
