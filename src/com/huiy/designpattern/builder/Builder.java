package com.huiy.designpattern.builder;

import java.util.Date;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 * 
   * ��1. һ��������Builder�ӿڣ������Ƕ�������ι�������������
 *    Ҳ����֪��ÿ�������������ʵ�֣��Լ����װ����Щ��������Ʒ��ȥ��
����2. ����һ��������Director��Director��֪����������������Ʒ��
              Ҳ����˵Director��������Ĺ����㷨������ͨ���Ƿֲ������ִ�С�

 */
public abstract class Builder {
	
	protected AutoMessage am;
	
	public  void buildTo(String to){
		am.setTo(to);
	};
	
	public void buildFrom(String from){
		am.setFrom(from);
	}
	
	public abstract void buildSubject();
	
	public abstract void buildBody();
	
	public  void buildDate(){
		am.setSendDate(new Date());
	}
	
	public  void sendMessage(){
		am.send();
	}
	

}
