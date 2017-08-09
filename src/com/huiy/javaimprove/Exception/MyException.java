package com.huiy.javaimprove.Exception;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 *
 *
 */
public class MyException extends RuntimeException {//Exception{
     public MyException(){
    	 
     }
     
     public MyException(String message){
    	 super(message);
     }
     
     public MyException(String message,Throwable cause){
    	 super(message,cause);
     }
}
