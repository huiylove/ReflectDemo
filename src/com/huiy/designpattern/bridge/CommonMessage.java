package com.huiy.designpattern.bridge;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }
    @Override
    public void sendMessage(String message, String toUser) {
        // ������ͨ��Ϣ��ֱ�ӵ��ø��෽����������Ϣ����
        super.sendMessage(message, toUser);
    }
}