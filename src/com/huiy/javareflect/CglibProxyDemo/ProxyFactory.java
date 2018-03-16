package com.huiy.javareflect.CglibProxyDemo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月9日
 * @version 1.0
 */
public class ProxyFactory implements MethodInterceptor{
	
	private Object target;
	 
	public ProxyFactory(Object target){
		this.target = target;
	}


	public Object getProxyInstance(){
		Enhancer enhancer = new Enhancer();    
        enhancer.setSuperclass(target.getClass());    
        // 回调方法    
        enhancer.setCallback(new MethodInterceptor(){
        	
			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2,
					MethodProxy arg3) throws Throwable {
				System.out.print("开始事物");
				arg1.invoke(arg1, arg2);
				System.out.print("结束事物");
				return null;
			}
        });    
        // 创建代理对象    
        return enhancer.create();   	
	}


	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("开始事物");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("结束事物");
        return null;    
	}
	

}
