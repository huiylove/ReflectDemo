package com.huiy.springioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月1日
 * @version 1.0
 */
public class LifeCyCleBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		  System.out.println("执行BeanPostProcessor的postProcessBeforeInitialization方法,beanName=" + beanName);
	      return bean;	
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("执行BeanPostProcessor的postProcessAfterInitialization方法,beanName=" + beanName);
        return bean;
	}
	
}

