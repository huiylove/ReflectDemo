package com.huiy.RPC.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��8��11��
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
