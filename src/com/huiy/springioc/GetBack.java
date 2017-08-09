package com.huiy.springioc;

import java.util.concurrent.Callable;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月29日
 * @version 1.0
 *
 *
 */
public class GetBack implements Callable<String>{

	// 与run()方法不同的是，call()方法具有返回值
	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName()+"线程执行完返回值：hello,world";
	}

}
