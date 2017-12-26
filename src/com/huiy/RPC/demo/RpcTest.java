package com.huiy.RPC.demo;

import java.io.IOException;
import java.net.InetSocketAddress;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年8月11日
 * @version 1.0
 *
 *
 */
public class RpcTest { 
	public static void main(String[] args){
		new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					RpcExporter.exporter("localhost",8088);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
		EchoService echo = importer.importer(EchoServiceImpl.class,new InetSocketAddress("localhost",8088));
		System.out.print(echo.hello("world!!!!!"));
	}
}
