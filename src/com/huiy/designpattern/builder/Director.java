package com.huiy.designpattern.builder;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class Director {
	
	Builder builder;
	
	public Director(Builder builder){
	   this.builder = builder;
	}

	
	 public void construct(String toAddress , String fromAddress){
		 builder.buildTo(toAddress);
		 builder.buildFrom(fromAddress);
		 builder.buildSubject();
		 builder.buildDate();
		 builder.buildBody();
		 builder.sendMessage();
	 }
}
