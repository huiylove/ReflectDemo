package com.huiy.RPC.stream;

import java.io.UnsupportedEncodingException;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��8��11��
 * @version 1.0
 * ͬһ���ַ��ڲ�ͬ�ı����»ᱻ��ɲ�ͬ���ȵı���
 *
 */
public class StreamTest {
	public static void main(String[] args){
		String str = "hello world!!!";
		try {
			byte[] bytes = str.getBytes("utf-8");//���ַ�������ֽ�����
			for(int i=0;i<bytes.length;i++){
				System.out.println(bytes[i]);
			}
			System.out.print(new String(bytes));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
