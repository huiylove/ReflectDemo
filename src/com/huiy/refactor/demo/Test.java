package com.huiy.refactor.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月7日
 * @version 1.0
 *
 *
 */
public class Test {
	
	private String ddd = "hello world";
	
	Test(){
		System.out.print("构造器初始化");
//		ddd = "hello world";
	}

	public boolean isNull(){
		return ddd==null?true:false;
	}
	
	public static void main(String[] args) {
		Test test1 = new Test();
		System.out.println(test1.getDdd());
		Test test2 = new Test();
		System.out.println(test2.getDdd());
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
