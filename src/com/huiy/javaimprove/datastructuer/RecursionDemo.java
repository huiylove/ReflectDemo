package com.huiy.javaimprove.datastructuer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月8日
 * @version 1.0
 * 递归调用
 */
public class RecursionDemo {

	 public static void main(String[] args){
		 addCount(5,6);
	 }
	 
	 public static void addCount(int i,int j){
		 if(i<j){
			 i++;
			 addCount(i,j);
			 System.out.println("递归结束");
		 }
	 }
	
}
