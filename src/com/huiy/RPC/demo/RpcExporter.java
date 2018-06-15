package com.huiy.RPC.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年8月11日
 * @version 1.0
 *
 *
 */
public class RpcExporter {
	
	static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	
	public static void exporter(String hostName,int port) throws IOException{
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocketAddress(hostName,port));
		try{
			while(true){
				executor.execute(new ExporterTask(server.accept()));
			}
		}finally{
			server.close();
		}
	}
	
	private static class ExporterTask implements Runnable{
		
		Socket client = null;
		
	    public ExporterTask(Socket client){
	    	this.client = client;
	    }
	    
		@Override
		public void run() {
			// TODO Auto-generated method stub
			ObjectInputStream input = null;
			ObjectOutputStream output = null;
			try{
				input = new ObjectInputStream(client.getInputStream());
				String interfaceName = input.readUTF();
				Class<?> service = Class.forName(interfaceName);
				String methodName = input.readUTF();
				Class<?>[] parameterTypes = (Class<?>[])input.readObject();
				Object[] arguments = (Object[])input.readObject();
				Method method = service.getMethod(methodName, parameterTypes);
				Object result = method.invoke(service.newInstance(), arguments); 
				output = new ObjectOutputStream(client.getOutputStream());
				output.writeObject(result);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(output!=null){
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(input!=null){
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(client!=null){
					try {
						client.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}
		
	}
}
