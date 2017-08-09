package com.huiy.javaimprove.Exception;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 *RuntimeException可以不用声明或者处理
 *
 */

public class MyexceptionTest {
       public void display(int i) throws MyException{
    	    if(i==0){
    	    	throw new MyException("抛出我定义的异常:该值不能为0,上级");
    	    }else{
    	    	System.out.println(i/2);
    	    }
       }
       
       public static void main(String[] args){
    	   MyexceptionTest test = new MyexceptionTest();
    	   try {
			   test.display(0);
		   } catch (MyException e) {
			   System.out.println(e.getMessage());
//   	       throw new MyException("抛出我定义的异常:该值不能为0",e);
//			   e.printStackTrace();
		   }
       }
}
