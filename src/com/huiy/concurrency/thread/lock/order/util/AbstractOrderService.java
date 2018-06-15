package com.huiy.concurrency.thread.lock.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
 * @version : 1.0
 */
public class AbstractOrderService implements OrderService{

	static int num;
	/**
	 * 生成订单号
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
