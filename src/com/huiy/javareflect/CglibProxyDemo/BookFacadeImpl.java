package com.huiy.javareflect.CglibProxyDemo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��20��
 * @version 1.0
 *
 *
 */
public class BookFacadeImpl {
   public void addBook(){
	   System.out.println("����ͼ��....");
   }
   
   public static void readBook(){
	   System.out.println("��ͼ��....");
   }
   
   public final void printBookName(String name){
	   System.out. println(name);
   }
}
