package com.huiy.designpattern.bridge;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        
        System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+toUser);
    }

}
