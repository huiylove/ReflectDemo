package com.huiy.javaimprove.Exception;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
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
