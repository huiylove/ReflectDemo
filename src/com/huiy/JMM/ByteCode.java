package com.huiy.JMM;
/** 
 * 字节码执行++i和i++的区别
 * @author : yuanhui 
 * @date   : 2018年3月20日
 * @version 1.0
 */
public class ByteCode {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
//			j = j++;
			++j;
		    j = ++j;//j= iload_1和istote_1的指令
		System.out.println(j);
	}

}
