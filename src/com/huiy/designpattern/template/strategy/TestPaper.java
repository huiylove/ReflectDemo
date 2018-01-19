package com.huiy.designpattern.template.strategy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月1日
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
		System.out.println("1.问题1");
		System.out.println("答案:"+paperAnswer.answer1());

	}
	
	public void question2(){
		System.out.println("1.问题2");
		System.out.println("答案:"+paperAnswer.answer2());
	}

	
}
