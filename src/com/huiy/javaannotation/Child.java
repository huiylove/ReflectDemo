package com.huiy.javaannotation;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��17��
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
