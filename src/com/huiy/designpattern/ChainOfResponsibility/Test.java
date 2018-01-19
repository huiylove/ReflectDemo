package com.huiy.designpattern.chainofresponsibility;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月5日
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		Handler hanlder1 = new ConcreteHandler("handler1");
		Handler hanlder2 = new ConcreteHandler("handler2");
		Handler hanlder3 = new ConcreteHandler("handler3");
		hanlder1.setSuccessor(hanlder2);
		hanlder2.setSuccessor(hanlder3);
		hanlder1.handleRequest();
	}

}
