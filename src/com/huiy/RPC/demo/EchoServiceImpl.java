package com.huiy.RPC.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年8月11日
 * @version 1.0
 *
 *
 */
public class EchoServiceImpl implements EchoService {

	@Override
	public String echo(String ping) {
		return ping!=null? ping+"--> I am OK.":"I am OK.";
	}

	@Override
	public String hello(String str) {
		return "hello "+str;
	}

}
