package com.huiy.springioc;

import java.util.concurrent.Callable;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
 * @version 1.0
 *
 *
 */
public class GetBack implements Callable<String>{

	// ��run()������ͬ���ǣ�call()�������з���ֵ
	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName()+"�߳�ִ���귵��ֵ��hello,world";
	}

}
