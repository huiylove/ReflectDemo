package com.huiy.javaimprove.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 *����������ʾ��������ĳ���쳣�����׳��쳣ʱ������ʾ������
 *��������û����ʾ������ĳ���쳣�����׳��쳣ʱ��ϵͳ����ʾ�쳣�ĳ���
 *���������У��ڶ����쳣��Ϣ����Exception in thread "main"������ʾ�˳����쳣��Ϣ��λ��
 */
public class ExceptionTest {
	    public static void main(String[] args) {  
	        String file = "D:\\exceptionTest.txt";  
	        FileReader reader;  
	        try {  
	            reader = new FileReader(file);  
	            Scanner in = new Scanner(reader);    
	            String string = in.next();    
	            System.out.println(string + "��֪���������ܹ�ִ�е���.....");  
	        } catch (FileNotFoundException e) {  
	            e.printStackTrace();  
	            System.out.println("�Բ���,��ִ�в���...");  
	        }    
	        finally{  
	            System.out.println("finally ��ִ��...");  
	        }  
	        int[] a = {1,2,3};
	        System.out.println(a[3]);
	    }  
}
