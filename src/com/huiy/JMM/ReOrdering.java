package com.huiy.JMM;

import com.huiy.concurrency.thread.sychronized.Apple;

/** 
 * @author : yuanhui 
 * @date   : 2018��3��13��
 * @version 1.0
 *  ָ��������
 *  �߳�Aִ��writer()���� 
 *  �߳�Bִ��reader()���� 
 *  �߳�B����y��ֵΪ2����һ����ȷ��x��ֵΪ1��
 *  ��Ϊ��writer()����������ܷ���ָ��������y��д�붯��������x֮ǰ����ʱ��B������x����0
 *  final������֤�ڴ�ɼ��ԣ��ڹ��캯���н��г�ʼ���󣬶������߳̿ɼ�
 *  volatile�������Խ�ָֹ��������ȷ��volatile����֮ǰ�Ĳ��������Ա�ִ�У��������V��ֵΪtrue,����Զ���x=1,y=2
 * 
 */
public class ReOrdering {
	public static ReOrdering reorder = new ReOrdering();
    int x = 0,y = 0;
    final int z;
    int m = 0;
	volatile boolean v = false;
	
	public static ReOrdering getInstance(){
		return reorder;
	}
	
	public ReOrdering(){
		m = 5;
		z = 3;
	}
	
	public void writer(){
		x = 1;
		y = 2;
		v = true;
	}
	
	public void reader(){
//		int r 1 = x;
//		int r2 = y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(v);
	}
	
	public static void main(String[] args){
		
	     new Thread("A"){
			@Override
			public void run() {
				getInstance().writer();
//				reOrder.reader();
			}
	    	 
	     }.start();
			
	     new Thread("B"){
				@Override
				public void run() {
					getInstance().reader();
				}
		    	 
		   }.start();
				
		
	}

}
