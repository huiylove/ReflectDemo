package com.huiy.javaimprove.staticdemo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *  静态变量是随着类加载时被完成初始化的，它在内存中仅有一个，
 *  且JVM也只会为它分配一次内存，同时类所有的实例都共享静态变量，可以直接通过类名来访问它
 *  它是伴随着实例的，每创建一个实例就会产生一个实例变量，它与该实例同生共死
 */
public class StaticTest {
    public static int count ;
    
    public StaticTest(){
    	count++;
    }
}
