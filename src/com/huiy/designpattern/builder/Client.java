package com.huiy.designpattern.builder;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class Client {
	public static void main(String[] args){
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("dd", "ee");
		
		
	}
}
