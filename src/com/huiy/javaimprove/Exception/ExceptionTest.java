package com.huiy.javaimprove.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 *若程序中显示的声明了某个异常，则抛出异常时不会显示出处，
 *若程序中没有显示的声明某个异常，当抛出异常时，系统会显示异常的出处
 *以下例子中：第二个异常信息多了Exception in thread "main"，这显示了出现异常信息的位置
 */
public class ExceptionTest {
	    public static void main(String[] args) {  
	        String file = "D:\\exceptionTest.txt";  
	        FileReader reader;  
	        try {  
	            reader = new FileReader(file);  
	            Scanner in = new Scanner(reader);    
	            String string = in.next();    
	            System.out.println(string + "不知道我有幸能够执行到不.....");  
	        } catch (FileNotFoundException e) {  
	            e.printStackTrace();  
	            System.out.println("对不起,你执行不到...");  
	        }    
	        finally{  
	            System.out.println("finally 在执行...");  
	        }  
	        int[] a = {1,2,3};
	        System.out.println(a[3]);
	    }  
}
