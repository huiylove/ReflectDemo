package com.huiy.javaimprove.stringanalyze;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��1��
 * @version 1.0
 */
public class StringTest {

	public static void main(String[] args) {
		String str1 = "abc";         

	    String str2 = new String("abc").intern();         

	    System.out.println(str1==str2);    

	}

}
