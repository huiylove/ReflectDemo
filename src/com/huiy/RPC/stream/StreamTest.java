package com.huiy.RPC.stream;

import java.io.UnsupportedEncodingException;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年8月11日
 * @version 1.0
 * 同一个字符在不同的编码下会被编成不同长度的编码
 *
 */
public class StreamTest {
	public static void main(String[] args){
		String str = "hello world!!!";
		try {
			byte[] bytes = str.getBytes("utf-8");//将字符编码成字节数组
			for(int i=0;i<bytes.length;i++){
				System.out.println(bytes[i]);
			}
			System.out.print(new String(bytes));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
