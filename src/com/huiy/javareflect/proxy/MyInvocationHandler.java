package com.huiy.javareflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月14日
 * @version 1.0
 *在使用动态代理类时，我们必须实现InvocationHandler接口
 */


public class MyInvocationHandler implements InvocationHandler {
	
    private Object obj = null;
    
 
    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), this);
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object temp = method.invoke(this.obj, args);
        return temp;
    }
}
 
