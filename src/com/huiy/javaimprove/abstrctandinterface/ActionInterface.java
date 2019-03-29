package com.huiy.javaimprove.abstrctandinterface;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
@FunctionalInterface
public interface ActionInterface {
	
//     public static final int a = 1;
     
     default void eat(){
    	 System.out.println("在不打破现有继承体系的基础上，改进接口。往接口新增方法时，不强制要求已经实现了接口的类也要实现新增的方法。");
     };
     
     public void fly();
}
