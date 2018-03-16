package com.huiy.javareflect.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月9日
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
				System.out.print("方法执行前----");
				method.invoke(target, args);
				System.out.print("方法执行后----");
				return null;
			}
		});
	}

}
