package com.huiy.designpattern.bridge;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class Client {
	
	  public static void main(String[] args) {
	        //���������ʵ�ֶ���
	        MessageImplementor impl = new MessageSMS();
	        //������ͨ��Ϣ����
	        AbstractMessage message = new  CommonMessage(impl);
	        message.sendMessage("�Ӱ���������","����");
	    }
}
