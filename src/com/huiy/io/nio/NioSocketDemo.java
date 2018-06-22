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
 * @date   : 2018��6��15��
 * @version : 1.0
 * 
 * NIO
 * 1��Selector   ���Ⱥͼ�ؿͻ��˺ͷ����(������)
 * 2��������  non-blocking  
 *    ������ʽ��Ϊ������ 
 *    ������  this.selector.select();
 *    �������ĵ��������ǣ���ȡ����
 *    �߳��� < ������
 * 
 */
public class NioSocketDemo {
	
	private Selector selector;//ͨ��ѡ��������������
	
	/**
	 * ��ʼ�������
	 * @param port
	 * @throws IOException 
	 */
	public void initServer(int port) throws IOException{
		 ServerSocketChannel ssc =  ServerSocketChannel.open();
		 ssc.configureBlocking(false);//������
		 ssc.socket().bind(new InetSocketAddress(port));//�󶨶˿�
		 
		 this.selector =  Selector.open();
		 ssc.register(selector,SelectionKey.OP_ACCEPT);//�¼�    
		 System.out.println("����������");
		 
	}
	
	
	public void listenSelector() throws IOException{
		//��ѯ����Seletor
		while(true){
			//�ȴ��ͻ�������
			//Selectģ��    ��·����    
			this.selector.select();//����1
//			this.selector.select(1000);//���ó�ʱʱ��
//			this.selector.wakeup();//����
			System.out.println("�µĿͻ�������");
			Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
			while(it.hasNext()){
				SelectionKey key = it.next();
				it.remove();
				//��������
				handle(key);
			}
		}
	}
	
	/**
	 * ����ͻ�������
	 * @param key
	 * @throws IOException 
	 */
	public void handle(SelectionKey key) throws IOException{
		if(key.isAcceptable()){
			//����ͻ��˵����������¼�
			ServerSocketChannel ssc = (ServerSocketChannel)key.channel();
			SocketChannel sc = ssc.accept();
			//���տͻ��˵���Ϣ����Ҫ��ͨ�����ö�Ȩ��
			sc.configureBlocking(false);//������
			sc.register(selector,SelectionKey.OP_READ);//ע��read�¼�
		}else if(key.isReadable()){
			//��������¼�
			SocketChannel sc = (SocketChannel)key.channel();
			ByteBuffer readBuffer = ByteBuffer.allocate(1024);//ֱ���ڴ�
			int readdata = sc.read(readBuffer);//��ȡ���ݵ�������
			if(readdata>0){
				String info = new String(readBuffer.array(),"GBK").trim();
				System.out.println("�ͻ��˷��͵���Ϣ��"+info);
			}else{
				System.out.println("�ͻ��˹ر���");
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
