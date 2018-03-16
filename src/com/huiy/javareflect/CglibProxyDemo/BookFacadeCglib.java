package com.huiy.javareflect.CglibProxyDemo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��20��
 * @version 1.0
 *  Aspect Oriented Programming  ʹ��MethodInterceptorʵ��AOP
 *  Spring AOP�������ǿ��ʹ��CGLIB����Ĭ�������ʹ��JDK�Ķ�̬����������ӿڡ�
 *  ����ͨ����̬������һ������ȥ������Ҫ������Ĳ���final�ķ����������ú�callback��
 *  ��ԭ�����ÿ���������þͻ�ת��ɵ����û���������ط�����interceptors��
 *
 */
public class BookFacadeCglib implements MethodInterceptor{
	
	private Object target;
	
    /**  
     * �����������  
     *   
     * @param target  
     * @return  
     */    
    public Object getInstance(Object target) {    
        this.target = target;    
        Enhancer enhancer = new Enhancer();    
        enhancer.setSuperclass(this.target.getClass());    
        // �ص�����    
        enhancer.setCallback(this);    
        // �����������    
        return enhancer.create();    
    }    
    

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("���￪ʼ");    
        proxy.invokeSuper(obj, args);    
        System.out.println("�������");    
        return null;    
	}

    

}
