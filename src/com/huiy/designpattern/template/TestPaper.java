package com.huiy.designpattern.template;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
 * @version 1.0
 *
 *
 */
public abstract class TestPaper {
	
	public void question1(){
		System.out.println("1.问题1");
		System.out.println("答案:"+answer1());

	}
	public void question2(){
		System.out.println("1.问题2");
		System.out.println("答案:"+answer2());
	}
	
	protected abstract String answer1();
	protected abstract String answer2();
	

}
