package com.huiy.JMM;
/** 
 * �ֽ���ִ��++i��i++������
 * @author : yuanhui 
 * @date   : 2018��3��20��
 * @version 1.0
 */
public class ByteCode {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
//			j = j++;
			++j;
		    j = ++j;//j= iload_1��istote_1��ָ��
		System.out.println(j);
	}

}
