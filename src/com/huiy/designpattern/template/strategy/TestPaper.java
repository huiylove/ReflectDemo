package com.huiy.designpattern.template.strategy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��1��
 * @version 1.0
 *
 *
 */
public class TestPaper {
	
	TestPaperAnswer paperAnswer;
	
	TestPaper(int type){
		switch(type){
			case 1: this.paperAnswer= new TestPaperAnswerA();
			case 2: this.paperAnswer= new TestPaperAnswerB();
		}
	}
	
	public void question1(){
		System.out.println("1.����1");
		System.out.println("��:"+paperAnswer.answer1());

	}
	
	public void question2(){
		System.out.println("1.����2");
		System.out.println("��:"+paperAnswer.answer2());
	}

	
}
