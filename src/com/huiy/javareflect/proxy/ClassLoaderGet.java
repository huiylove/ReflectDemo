package com.huiy.javareflect.proxy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月15日
 * @version 1.0
 *
 *
 */
public class ClassLoaderGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject sj = new RealSubject();
        System.out.println("类加载器  "+sj.getClass().getClassLoader().getClass().getName());
	}

}
