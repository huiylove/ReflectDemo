package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 * 局部内部类
 *
 */
public class Display {
	    public void display(final String name,String age){  
	        class InnerClass{  
	            void display(){  
	                System.out.println(name);  
	            } 
	        }  
            InnerClass inc =  new  InnerClass();
            inc.display();
	    }  
	    
	    public static void main(String[] args){
	    	Display pc = new Display();
	    	pc.display("ddd", "12");
	    	
	    }
	
}
