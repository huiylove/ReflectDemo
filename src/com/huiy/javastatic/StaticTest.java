package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class StaticTest {
	 /** 构造方法*/  
    public StaticTest() {  
        System.out.println("构造函数被执行了!");  
    }  
    /** 静态代码快*/  
    static {  
        System.out.println("静态代码块被执行了!");  
        //show();  
    }  
    /** 静态方法*/  
    public static void show(){  
        System.out.println("静态方法被执行了!");  
    }  
}
