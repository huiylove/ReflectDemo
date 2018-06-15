package com.huiy.concurrency.thread.lock.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 */
public class AbstractOrderService implements OrderService{

	static int num;
	/**
	 * ���ɶ�����
	 * @return
	 */
	public String getOrderNo(){
		return getOrderNo2();
	};
	
	synchronized public static String getOrderNo2(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+"-"+num++;
	};


}
