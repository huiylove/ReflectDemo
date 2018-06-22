package com.huiy.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;


/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 * 
 * NIO
 * 1、Selector   调度和监控客户端和服务端(调度器)
 * 2、非阻塞  non-blocking  
 *    阻塞方式改为非阻塞 
 *    阻塞点  this.selector.select();
 *    真正关心的阻塞点是：读取数据
 *    线程数 < 连接数
 * 
 */
public class NioSocketDemo {
	
	private Selector selector;//通道选择器（管理器）
	
	/**
	 * 初始化服务端
	 * @param port
	 * @throws IOException 
	 */
	public void initServer(int port) throws IOException{
		 ServerSocketChannel ssc =  ServerSocketChannel.open();
		 ssc.configureBlocking(false);//非阻塞
		 ssc.socket().bind(new InetSocketAddress(port));//绑定端口
		 
		 this.selector =  Selector.open();
		 ssc.register(selector,SelectionKey.OP_ACCEPT);//事件    
		 System.out.println("服务已启动");
		 
	}
	
	
	public void listenSelector() throws IOException{
		//轮询监听Seletor
		while(true){
			//等待客户端连接
			//Select模型    多路复用    
			this.selector.select();//阻塞1
//			this.selector.select(1000);//设置超时时间
//			this.selector.wakeup();//唤醒
			System.out.println("新的客户连接上");
			Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
			while(it.hasNext()){
				SelectionKey key = it.next();
				it.remove();
				//处理请求
				handle(key);
			}
		}
	}
	
	/**
	 * 处理客户端请求
	 * @param key
	 * @throws IOException 
	 */
	public void handle(SelectionKey key) throws IOException{
		if(key.isAcceptable()){
			//处理客户端的连接请求事件
			ServerSocketChannel ssc = (ServerSocketChannel)key.channel();
			SocketChannel sc = ssc.accept();
			//接收客户端的信息，需要给通道设置读权限
			sc.configureBlocking(false);//非阻塞
			sc.register(selector,SelectionKey.OP_READ);//注册read事件
		}else if(key.isReadable()){
			//处理读的事件
			SocketChannel sc = (SocketChannel)key.channel();
			ByteBuffer readBuffer = ByteBuffer.allocate(1024);//直接内存
			int readdata = sc.read(readBuffer);//读取数据到缓冲区
			if(readdata>0){
				String info = new String(readBuffer.array(),"GBK").trim();
				System.out.println("客户端发送的消息："+info);
			}else{
				System.out.println("客户端关闭了");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			NioSocketDemo demo = new NioSocketDemo();
			demo.initServer(8888);
			demo.listenSelector();

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}	
}
