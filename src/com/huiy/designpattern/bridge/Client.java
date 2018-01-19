package com.huiy.designpattern.bridge;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class Client {
	
	  public static void main(String[] args) {
	        //创建具体的实现对象
	        MessageImplementor impl = new MessageSMS();
	        //创建普通消息对象
	        AbstractMessage message = new  CommonMessage(impl);
	        message.sendMessage("加班申请速批","李总");
	    }
}
