package com.huiy.springioc;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class Grade implements   ApplicationContextAware,
ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware{
	private int math;  
    private int english; 
    
    
    public int getMath() {  
        return math;  
    }  
    public void setMath(int math) {  
        this.math = math;  
    }  
    public int getEnglish() {  
        return english;  
    }  
    public void setEnglish(int english) {  
    	System.out.println("����english����");
        this.english = english;  
    }  
    
 @Override
public void setBeanClassLoader(ClassLoader classLoader) {
System.out.println("ִ��setBeanClassLoader,ClassLoader Name = " + classLoader.getClass().getName());
}

@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
System.out.println("ִ��setBeanFactory,setBeanFactory:: Grade bean singleton=" +  beanFactory.isSingleton("Grade"));
}

@Override
public void setBeanName(String s) {
System.out.println("ִ��setBeanName:: Bean Name defined in context="
        + s);
}

@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
System.out.println("ִ��setApplicationContext:: Bean Definition Names="
        + Arrays.toString(applicationContext.getBeanDefinitionNames()));

}

@Override
public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
System.out.println("ִ��setApplicationEventPublisher");
}

@Override
public void setEnvironment(Environment environment) {
System.out.println("ִ��setEnvironment");
}

@Override
public void setResourceLoader(ResourceLoader resourceLoader) {

Resource resource = resourceLoader.getResource("classpath:/com/huiy/springioc/beans.xml");
System.out.println("ִ��setResourceLoader:: Resource File Name="
        + resource.getFilename());

}

@Override
public void setImportMetadata(AnnotationMetadata annotationMetadata) {
System.out.println("ִ��setImportMetadata");
}
}
