package com.huiy.javareflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��14��
 * @version 1.0
 *��ʹ�ö�̬������ʱ�����Ǳ���ʵ��InvocationHandler�ӿ�
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
 
