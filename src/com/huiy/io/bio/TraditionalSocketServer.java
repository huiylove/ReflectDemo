package com.huiy.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018��6��15��
 * @version : 1.0
 * 
 * �����Ż�    ϵͳ��Դ  IO���洢���ڴ桢CPU
 * 
 */
public class TraditionalSocketServer {
	
	
	public static void main(String[] args) throws IOException {
		    ExecutorService threadPool = Executors.newCachedThreadPool();
			ServerSocket server = new ServerSocket(7777);
			System.out.println("���������");
			
			while(true){
			    final Socket client = server.accept();//������1
				
				threadPool.execute(new Runnable(){
					

					@Override
					public void run() {
						System.out.println("�µĿͻ��˵���������");
						try {
							BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
							PrintWriter out = new PrintWriter(client.getOutputStream(),true);
							while(true){
								String body = br.readLine();//������2
								if(body==null) break;
								System.out.println("Server:"+body);
				                out.println("hello,yuanhui!!!");
							}	
						} catch (IOException e) {
							e.printStackTrace();
						}
											
					}
				});
				
//			    InputStream is = client.getInputStream();
//				byte[] buffer =  new byte[1024];
//				int buf;
//				while(true){
//					buf = is.read(buffer);
//					if(buf==-1) break;
//					System.out.println("Server:"+new String(buffer,0,buf));
//
//				}
//				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//				out = new PrintWriter(client.getOutputStream(),true);
//				String body ;
//				while(true){
//					body = br.readLine();//������2
//					if(body==null) break;
//					System.out.println("Server:"+body);
//	                out.println("hello,yuanhui!!!");
//				}
			}
		} 
}
