package com.huiy.designpattern.observeexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class MessageWarn implements Observer{
	
	@Override
	public void update() {
		System.out.println("短信预警");
	}
}
