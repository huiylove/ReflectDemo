package com.huiy.javaimprove.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��14��
 * @version 1.0
 *
 *
 */
public class InputAndOutputStream {
	
	public static void main(String[] args){
		try {
			OutputStream out = new BufferedOutputStream(new ObjectOutputStream(new FileOutputStream("fileName")));
			String charSet = "UTF-8";
			Reader reader = new InputStreamReader(new FileInputStream("filePath"),charSet);//�ֽڵ��ַ�����
			InputStream is = new BufferedInputStream(new FileInputStream("filePath"));
			String s = "1555";
			byte[] s_to_b = s.getBytes("UTF-8");//�ַ� to �ֽ�
			String b_to_s = new String(s_to_b,"UTF-8");//�ֽ� to �ַ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
