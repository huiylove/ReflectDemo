package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��4��12��
 * @version 1.0
 */
public class ClassloaderDemo {
	
		 {
			System.out.println("��������");
	
		 }
	
		 static{
		    System.out.println("��̬����");
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
	        System.out.println("���캯��");
	    }  
	  
	    public static ClassloaderDemo getInstance() {  
	        return singleTon;  
	    }  
	    
}  


