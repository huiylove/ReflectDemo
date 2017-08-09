package com.huiy.javaserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��15��
 * @version 1.0
 * ���л�
 * ���Ǵ�����ģ�������һ�����󱣴���Ӳ���ϣ���ֻ��ʹ�����ַ�ʽ��
 * ���Ĺؼ��ǽ�����״̬��һ�ִ��и�ʽ��ʾ�������Ա��Ժ���ö���ʱ�ܹ�����������
 * Java��Զ�̷�������(RMI)��ͨ��socketͨ�š�
 * �������û������ǰѶ����Ӳ���ϣ�������豸��
 * ����һ�����Ա����л����࣬����ʵ��һ��Serializable�Ľӿ�
 */
public class SerializeDate {
	
	SerializeDate() {
		Date d = new Date ();
		try {
			File file = new File("c:/Users/user/Desktop/date.ser");
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream (file); //�����date.ser����ļ���
			ObjectOutputStream s = new ObjectOutputStream (fos);
			s.writeObject (d); //д����,������dд����date.ser�ļ�
			s.close (); //�ر���
			FileInputStream fis = new FileInputStream (file); //��date.ser����ļ����뵽����
			ObjectInputStream ois = new ObjectInputStream(fis);
			Date nd = (Date)ois.readObject();//�����󣬴�date.ser�ļ��ж�ȡDate����
			System.out.print(nd.getMonth());
		} catch (IOException e) {
			e.printStackTrace ();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SerializeDate();
	}

}
