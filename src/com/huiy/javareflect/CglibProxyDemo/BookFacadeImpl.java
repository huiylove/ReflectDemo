package com.huiy.javareflect.CglibProxyDemo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月20日
 * @version 1.0
 *
 *
 */
public class BookFacadeImpl {
   public void addBook(){
	   System.out.println("新增图书....");
   }
   
   public static void readBook(){
	   System.out.println("读图书....");
   }
   
   public final void printBookName(String name){
	   System.out. println(name);
   }
}
