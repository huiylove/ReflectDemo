package com.huiy.javareflect.factory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月15日
 * @version 1.0
 * 利用反射机制构建工厂类
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
