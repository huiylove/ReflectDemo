package com.huiy.designpattern.template;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
 * @version 1.0
 *
 *
 */
public abstract class TestPaper {
	
	public void question1(){
		System.out.println("1.����1");
		System.out.println("��:"+answer1());

	}
	public void question2(){
		System.out.println("1.����2");
		System.out.println("��:"+answer2());
	}
	
	protected abstract String answer1();
	protected abstract String answer2();
	

}
