package com.huiy.javaimprove.datastructuer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��8��
 * @version 1.0
 * �ݹ����
 */
public class RecursionDemo {

	 public static void main(String[] args){
		 addCount(5,6);
	 }
	 
	 public static void addCount(int i,int j){
		 if(i<j){
			 i++;
			 addCount(i,j);
			 System.out.println("�ݹ����");
		 }
	 }
	
}
