package com.huiy.designpattern.singleton;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 * 饿汉单例模式
 *
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
//	private static Singleton instance = null;

	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	//双重校验锁
//	public static Singleton getInstance(){
//		if(instance==null){
//			synchronized(Singleton.class){
//				if(instance==null){
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	
    //静态内部类
//	private static class SingletonHolder{
//		private static Singleton INSTANCE  = new Singleton();
//	}
	
//	public static final Singleton getInstance(){
//		return SingletonHolder.INSTANCE;
//	}
	
}
