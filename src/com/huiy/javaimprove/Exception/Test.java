package com.huiy.javaimprove.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 * �쳣��-��õİ취���ǽ���Щ�쳣��Ϣ��װ��Ȼ�󲶻����ǵķ�װ�༴��
 * try��catch��catch�����ǿ��Բ���Ҫ���κδ�������ֻ��throw����ؼ��ֽ����Ƿ�װ�쳣��Ϣ�����׳�����
 * Ȼ����ͨ���ؼ���throws�����׳��÷����쳣��
 * �����ϲ�Ҳ�����������Ĵ����Դ����ƾͻ����һ�����쳣���ɵ��쳣����
 */
public class Test {
	    public void f() {//throws MyException{  
	         try {  
	             FileReader reader = new FileReader("G:\\myfile\\struts.txt");    
	             Scanner in = new Scanner(reader);    
	             System.out.println(in.next());  
	        } catch (FileNotFoundException e) {  
	            //e �����쳣��Ϣ  
	            throw new MyException("�ļ�û���ҵ�--01",e); //==e�������ԭ�����쳣��ϢFileNotFoundException
	        }    
	    }  
	      
	    public void g()  {//throws MyException{  
	        try {  
	            f();  
	        } catch (MyException e) {  
	            //e �����쳣��Ϣ  
	            throw new MyException("�ļ�û���ҵ�--02",e);  //==e�������ԭ�����쳣��ϢMyException
	        }  
	    }  
	      
	    public static void main(String[] args) {  
	        Test t = new Test();  
	        try {  
	            t.g();  
	        } catch (MyException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
