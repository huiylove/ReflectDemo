package com.huiy.javaimprove.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年5月3日
 */
public class IoInAction {
	
	private static final String src_file = "D:/test.txt";
	
	public static void main(String[] args){
		
		try {
			//1.读取字节流
			FileInputStream fis = new FileInputStream(src_file);
			byte[] buffer = new byte[1024];
			int buffRead;
			fis.read();
			StringBuilder sb = new StringBuilder();
			while((buffRead = fis.read(buffer,0,buffer.length-1))!=-1){
				sb.append(new String(buffer).trim());
				
			}
			System.out.print(sb);
			fis.close();
			//2.读取字符流
//			BufferedReader buffReader = new BufferedReader(new FileReader(src_file));
//			String buffRead;
//			StringBuilder sb = new StringBuilder();
//			while((buffRead=buffReader.readLine())!=null){
//				sb.append(buffRead+"\n");
//			}
//			System.out.print(sb);
//			buffReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
		}
	}

}
