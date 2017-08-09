package com.huiy.javaannotation;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月17日
 * @version 1.0
 *
 *
 */
@Description("i am a class description")
public class Child implements Person{

	@Override
	@Description("i am a method description")
	public String name() {
		return null;
	}

	@Override
	public int age() {
		return 0;
	}

	@Override
	public void work() {
		
	}

}
