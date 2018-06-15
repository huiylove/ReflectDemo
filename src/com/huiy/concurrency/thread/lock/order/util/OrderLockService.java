package com.huiy.concurrency.thread.lock.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018Äê6ÔÂ14ÈÕ
 * @version : 1.0
 */
public class OrderLockService
//extends AbstractOrderService 
implements OrderService{

	
	static int num=0;

	
	@Override
	synchronized public String getOrderNo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+"-"+num++;
	}

	
}
