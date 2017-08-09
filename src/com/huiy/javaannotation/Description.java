package com.huiy.javaannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


	/**
	 * @Target是这个注解的作用域，ElementType.METHOD是这个注解的作用域的列表，METHOD是方法声明，除此之外，还有：
		CONSTRUCTOR（构造方法声明）,FIELD（字段声明）,LOCAL VARIABLE（局部变量声明）,METHOD（方法声明）,PACKAGE（包声明）,PARAMETER（参数声明）,TYPE（类接口）
		
		第二行：@Retention是它的生命周期，前面不是说注解按照运行机制有一个分类嘛，RUNTIME就是在运行时存在，可以通过反射读取。除此之外，还有:
		SOURCE（只在源码显示，编译时丢弃）,CLASS（编译时记录到class中，运行时忽略）,RUNTIME（运行时存在，可以通过反射读取）
		
		第三行：@Inherited是一个标识性的元注解，它允许子注解继承它。
		
		第四行：@Documented，生成javadoc时会包含注解。
		
		使用自定义注解：
		使用注解的语法：
		@<注解名>(<成员名1>=<成员值1>,<成员名1>=<成员值1>,…)

	 * 
	 * */
	@Target({ElementType.METHOD,ElementType.TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@Inherited
	@Documented
	public @interface Description {
	    String value();
	}

