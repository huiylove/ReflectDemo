package com.huiy.designpattern.bridge;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public abstract class AbstractMessage {
	
	//����һ��ʵ�ֲ��ֵĶ���
    MessageImplementor impl;
    /**
     * ���췽��������ʵ�ֲ��ֵĶ���
     * @param impl  ʵ�ֲ��ֵĶ���
     */
    public AbstractMessage(MessageImplementor impl){
        this.impl = impl;
    }
    /**
     * ������Ϣ��ί�ɸ�ʵ�ֲ��ֵķ���
     * @param message    Ҫ������Ϣ������
     * @param toUser    ��Ϣ�Ľ�����
     */
    public void sendMessage(String message , String toUser){
        this.impl.send(message, toUser);
    }
}
