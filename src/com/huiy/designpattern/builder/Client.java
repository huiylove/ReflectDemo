package com.huiy.designpattern.builder;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class Client {
	public static void main(String[] args){
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("dd", "ee");
		
		
	}
}
