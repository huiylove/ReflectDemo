package com.huiy.javastatic;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年4月12日
 * @version 1.0
 */
public class ClassloaderDemo {
	
		 {
			System.out.println("构造代码块");
	
		 }
	
		 static{
		    System.out.println("静态变量");
		 }

	    private static ClassloaderDemo singleTon = new ClassloaderDemo();  
	    public static int count1;  
	    public static int count2 = 0;  
	  
	    static{
	    	System.out.println(count1);
	    	System.out.println(count2);
	    }
	    
	    
	    private ClassloaderDemo() {  
	        count1++;  
	        count2++;  
	        System.out.println("构造函数");
	    }  
	  
	    public static ClassloaderDemo getInstance() {  
	        return singleTon;  
	    }  
	    
}  


