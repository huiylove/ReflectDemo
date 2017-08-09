package com.huiy.designpattern.observeexam;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
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
