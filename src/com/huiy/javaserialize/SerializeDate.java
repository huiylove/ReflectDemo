package com.huiy.javaserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月15日
 * @version 1.0
 * 序列化
 * 它是传对象的，如果想把一个对象保存在硬盘上，就只能使用这种方式。
 * 它的关键是将它的状态以一种串行格式表示出来，以便以后读该对象时能够把它读出来
 * Java的远程方法调用(RMI)，通过socket通信。
 * 对象永久化，就是把对象存硬盘上，或外存设备上
 * 对于一个可以被序列化的类，它会实现一个Serializable的接口
 */
public class SerializeDate {
	
	SerializeDate() {
		Date d = new Date ();
		try {
			File file = new File("c:/Users/user/Desktop/date.ser");
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream (file); //输出到date.ser这个文件中
			ObjectOutputStream s = new ObjectOutputStream (fos);
			s.writeObject (d); //写对象,将对象d写成是date.ser文件
			s.close (); //关闭流
			FileInputStream fis = new FileInputStream (file); //将date.ser这个文件输入到流中
			ObjectInputStream ois = new ObjectInputStream(fis);
			Date nd = (Date)ois.readObject();//读对象，从date.ser文件中读取Date对象
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
