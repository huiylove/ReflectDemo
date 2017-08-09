package com.huiy.javareflect.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月15日
 * @version 1.0
 *
 *
 */
public class HelloHandler implements InvocationHandler{
	
	private Object obj;
	
	public HelloHandler(Object obj){
		this.obj = obj;
	}
	
	public HelloHandler(){
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before");
		Object robj = method.invoke(this.obj, args);
		System.out.println("after");
		return robj;
	}
	
	public Object getProxy(Object target){
		this.obj = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
	}

}
