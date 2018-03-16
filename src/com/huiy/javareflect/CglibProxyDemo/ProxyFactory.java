package com.huiy.javareflect.CglibProxyDemo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��9��
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
        // �ص�����    
        enhancer.setCallback(new MethodInterceptor(){
        	
			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2,
					MethodProxy arg3) throws Throwable {
				System.out.print("��ʼ����");
				arg1.invoke(arg1, arg2);
				System.out.print("��������");
				return null;
			}
        });    
        // �����������    
        return enhancer.create();   	
	}


	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("��ʼ����");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("��������");
        return null;    
	}
	

}
