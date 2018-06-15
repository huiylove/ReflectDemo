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
public class OrderAtomicService
//extends AbstractOrderService 
implements OrderService{

	
	static AtomicInteger autonum = new AtomicInteger(0);

	
	@Override
	public String getOrderNo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+"-"+autonum.incrementAndGet();
	}

	
}
