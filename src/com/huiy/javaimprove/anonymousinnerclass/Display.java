package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 * �ֲ��ڲ���
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
