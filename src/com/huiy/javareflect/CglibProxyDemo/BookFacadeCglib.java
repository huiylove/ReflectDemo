package com.huiy.javareflect.CglibProxyDemo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月20日
 * @version 1.0
 *  Aspect Oriented Programming  使用MethodInterceptor实现AOP
 *  Spring AOP，如果不强制使用CGLIB包，默认情况是使用JDK的动态代理来代理接口。
 *  它是通过动态的生成一个子类去覆盖所要代理类的不是final的方法，并设置好callback，
 *  则原有类的每个方法调用就会转变成调用用户定义的拦截方法（interceptors）
 *
 */
public class BookFacadeCglib implements MethodInterceptor{
	
	private Object target;
	
    /**  
     * 创建代理对象  
     *   
     * @param target  
     * @return  
     */    
    public Object getInstance(Object target) {    
        this.target = target;    
        Enhancer enhancer = new Enhancer();    
        enhancer.setSuperclass(this.target.getClass());    
        // 回调方法    
        enhancer.setCallback(this);    
        // 创建代理对象    
        return enhancer.create();    
    }    
    

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("事物开始");    
        proxy.invokeSuper(obj, args);    
        System.out.println("事物结束");    
        return null;    
	}

    

}
