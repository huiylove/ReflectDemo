package com.huiy.javareflect.CglibProxyDemo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��20��
 * @version 1.0
 *
 *
 */
public class BookCglibTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BookFacadeCglib cglib = new BookFacadeCglib();    
	      BookFacadeImpl bookCglib= (BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());    
	      bookCglib.addBook();    
	}

}
