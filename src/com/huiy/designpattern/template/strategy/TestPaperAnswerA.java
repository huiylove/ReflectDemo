package com.huiy.designpattern.template.strategy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月16日
 * @version 1.0
 */
public class TestPaperAnswerA implements TestPaperAnswer{

	@Override
	public String answer1() {
		return "A";
	}

	@Override
	public String answer2() {
		return "B";
	}

}
