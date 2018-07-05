package com.huiy.concurrency.thread.lock.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��14��
 * @version : 1.0
 * 
 * ����
 */
public class OrderNoLockService
implements OrderService{
	
	static int num=0;

	@Override
    public String getOrderNo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date())+"-"+num++;
	}

	
}
