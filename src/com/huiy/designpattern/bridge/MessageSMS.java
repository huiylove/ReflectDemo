package com.huiy.designpattern.bridge;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        
        System.out.println("ʹ��ϵͳ�ڶ���Ϣ�ķ�����������Ϣ'"+message+"'��"+toUser);
    }

}
