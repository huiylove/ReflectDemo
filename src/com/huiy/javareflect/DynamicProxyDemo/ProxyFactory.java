package com.huiy.javareflect.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��9��
 * @version 1.0
 */
public class ProxyFactory {
	
	private Object target;
	
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.print("����ִ��ǰ----");
				method.invoke(target, args);
				System.out.print("����ִ�к�----");
				return null;
			}
		});
	}

}
