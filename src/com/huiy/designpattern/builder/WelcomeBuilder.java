package com.huiy.designpattern.builder;



/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public  class WelcomeBuilder extends Builder{
	
	WelcomeBuilder(){
		am = new WelcomeMessage();
	}
	
	@Override
	public void buildSubject() {
		super.am.setSubject("��ӭ����");
	}

	@Override
	public void buildBody() {
		super.am.setBody("��ӭ����---------");

	}

	

}
