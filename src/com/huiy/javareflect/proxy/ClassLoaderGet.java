package com.huiy.javareflect.proxy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��15��
 * @version 1.0
 *
 *
 */
public class ClassLoaderGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject sj = new RealSubject();
        System.out.println("�������  "+sj.getClass().getClassLoader().getClass().getName());
	}

}
