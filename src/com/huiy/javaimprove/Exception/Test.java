package com.huiy.javaimprove.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 * 异常链-最好的办法就是将这些异常信息封装，然后捕获我们的封装类即可
 * try…catch的catch块我们可以不需要做任何处理，仅仅只用throw这个关键字将我们封装异常信息主动抛出来。
 * 然后在通过关键字throws继续抛出该方法异常。
 * 它的上层也可以做这样的处理，以此类推就会产生一条由异常构成的异常链。
 */
public class Test {
	    public void f() {//throws MyException{  
	         try {  
	             FileReader reader = new FileReader("G:\\myfile\\struts.txt");    
	             Scanner in = new Scanner(reader);    
	             System.out.println(in.next());  
	        } catch (FileNotFoundException e) {  
	            //e 保存异常信息  
	            throw new MyException("文件没有找到--01",e); //==e保存的是原来的异常信息FileNotFoundException
	        }    
	    }  
	      
	    public void g()  {//throws MyException{  
	        try {  
	            f();  
	        } catch (MyException e) {  
	            //e 保存异常信息  
	            throw new MyException("文件没有找到--02",e);  //==e保存的是原来的异常信息MyException
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
