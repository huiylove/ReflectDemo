package com.huiy.javaimprove.Exception;


import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 *RuntimeException可以不用声明或者处理
 *
 */
public class MyexceptionTest1 {
	
	
	  
	
       public void display(int i) throws MyException{
	    	try {
				System.out.println(10/i);
			} catch (Exception e) {
				throw new MyException("抛出我定义的异常:该值不能为0,上级",e);
			}
       }
       
       public static void main(String[] args){
    	   //加载配置文件
           PropertyConfigurator.configure("src/com/huiy/javaimprove/Exception/log4j.properties");
           //获取loger记录器,参数一般指定当前类的class
    	   Logger log = LoggerFactory.getLogger(MyexceptionTest1.class);
    	   MyexceptionTest1 test = new MyexceptionTest1();
    	   try {
			   test.display(0);
		   }catch (MyException e) {
			   System.out.println(e.getMessage());
//   	       throw new MyException("抛出我定义的异常:该值不能为0",e);
//			   e.printStackTrace();
		   }catch (Exception e) {
		       log.error("计算信息异常",e);
//			   System.out.println(e.getMessage());
//   	       throw new MyException("抛出我定义的异常:该值不能为0",e);
//			   e.printStackTrace();
		   }
       }
}
