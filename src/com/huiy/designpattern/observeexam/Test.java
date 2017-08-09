package com.huiy.designpattern.observeexam;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		ExceptionWarn exceptionWarn = new ExceptionWarn();
		EmailWarn emailWarn = new EmailWarn();
		MessageWarn messageWarn = new MessageWarn();
		exceptionWarn.registerObserver(emailWarn);
		exceptionWarn.registerObserver(messageWarn);
		exceptionWarn.notifyObserver();
	}

}
