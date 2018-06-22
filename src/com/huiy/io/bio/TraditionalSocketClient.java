package com.huiy.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 */
public class TraditionalSocketClient {
	
	private static String ip_address = "127.0.0.1";
	
	private static int port = 7777;

	
	public static void main(String[] args) {
		Socket socket ;
		BufferedReader br;
		PrintWriter out;
		System.out.println("客户端启动");
		try {
			socket = new  Socket(ip_address,port);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out  = new PrintWriter(socket.getOutputStream(),true);
			out.println("hi,i am yuanhui,long time no see");
			System.out.println("Client:"+br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
