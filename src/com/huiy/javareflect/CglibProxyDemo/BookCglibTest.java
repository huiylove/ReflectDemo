package com.huiy.javareflect.CglibProxyDemo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月20日
 * @version 1.0
 *
 *
 */
public class BookCglibTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  BookFacadeCglib cglib = new BookFacadeCglib();    
//	      BookFacadeImpl bookCglib= (BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());  
		  BookFacadeImpl  bookImpl = new BookFacadeImpl();
	      BookFacadeImpl bookCglib = (BookFacadeImpl) new ProxyFactory(bookImpl).getProxyInstance();
	      bookCglib.addBook();
	      BookFacadeImpl.readBook();
	      bookCglib.printBookName("《深入理解java虚拟机》");
	}

}
