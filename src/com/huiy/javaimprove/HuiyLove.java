package com.huiy.javaimprove;

/**
 * @author huiylove
 * @date 2019年4月18日
 */
public class HuiyLove extends Person{

	public HuiyLove(){
		eat();
	}
	
	public void eat(){
		System.out.println("huiylove eat");
	}
	
	public static void main(String[] args) {
		int i = "abc".length();
		char c = '8';
		short s = 8;
		byte b = (byte)c; //-128~127
		System.out.println(b);
		int c2i = c;//转换为ASCII码
		double d = 1.24;
		float f = 1.24f;
		int ii = 021;//
		Short S = 988;
		double dd = f;           
	}
	
}
