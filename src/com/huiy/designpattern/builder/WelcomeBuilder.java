package com.huiy.designpattern.builder;



/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public  class WelcomeBuilder extends Builder{
	
	WelcomeBuilder(){
		am = new WelcomeMessage();
	}
	
	@Override
	public void buildSubject() {
		super.am.setSubject("欢迎主题");
	}

	@Override
	public void buildBody() {
		super.am.setBody("欢迎主题---------");

	}

	

}
