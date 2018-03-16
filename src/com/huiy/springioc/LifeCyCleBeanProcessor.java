package com.huiy.springioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��1��
 * @version 1.0
 */
public class LifeCyCleBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		  System.out.println("ִ��BeanPostProcessor��postProcessBeforeInitialization����,beanName=" + beanName);
	      return bean;	
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("ִ��BeanPostProcessor��postProcessAfterInitialization����,beanName=" + beanName);
        return bean;
	}
	
}

