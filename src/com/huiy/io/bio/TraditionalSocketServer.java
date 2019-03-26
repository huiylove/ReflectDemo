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
 * @date   : 2018年6月15日
 * @version : 1.0
 * 
 * 性能优化    系统资源  IO、存储、内存、CPU
 * 
 */
public class TraditionalSocketServer {
	
	
	public static void main(String[] args) throws IOException {
		    ExecutorService threadPool = Executors.newCachedThreadPool();
			ServerSocket server = new ServerSocket(7777);
			System.out.println("服务端启动");
			
			while(true){
			    final Socket client = server.accept();//阻塞点1
				
				threadPool.execute(new Runnable(){
					

					@Override
					public void run() {
						System.out.println("新的客户端的连接请求");
						try {
							BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
							PrintWriter out = new PrintWriter(client.getOutputStream(),true);
							while(true){
								String body = br.readLine();//阻塞点2
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
//					body = br.readLine();//阻塞点2
//					if(body==null) break;
//					System.out.println("Server:"+body);
//	                out.println("hello,yuanhui!!!");
//				}
			}
		} 
}
