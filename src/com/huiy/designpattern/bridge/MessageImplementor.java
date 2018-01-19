package com.huiy.designpattern.bridge;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public interface MessageImplementor {
    /**
     * ������Ϣ
     * @param message Ҫ������Ϣ������
     * @param toUser  ��Ϣ�Ľ�����
     */
    public void send(String message , String toUser);
}