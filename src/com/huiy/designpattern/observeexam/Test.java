package com.huiy.designpattern.observeexam;

import java.util.ArrayList;
import java.util.Iterator;


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
		ExceptionSubject exceptionWarn = new ExceptionSubject();
		EmailWarn emailWarn = new EmailWarn();
		MessageWarn messageWarn = new MessageWarn();
		exceptionWarn.registerObserver(emailWarn);
		exceptionWarn.registerObserver(messageWarn);
		exceptionWarn.notifyObserver();
		
		ArrayList list = new ArrayList();
		Iterator it = list.iterator();
	}

}
