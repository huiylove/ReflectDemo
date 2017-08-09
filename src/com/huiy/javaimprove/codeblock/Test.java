package com.huiy.javaimprove.codeblock;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public class Test {
	
	 /** 
     * 静态代码块-它是随着类的加载而被执行，只要类被加载了就会执行
     *            而且只会加载一次，主要用于给类进行初始化
     */  
    static {  
        System.out.println("执行静态代码块...");  
    }  
	
	 /** 
     * 构造代码 -每创建一个对象时就会执行一次，且优先于构造函数，主要用于初始化不同对象共性的内容和初始化实例环境
     */  
    {  
        System.out.println("执行构造代码块...");  
    }  
      
    /** 
     * 无参构造函数 -每创建一个对象时就会执行一次
     * 同时构造函数是给特定对象进行初始化，而构造代码是给所有对象进行初始化，作用区域不同
     */  
    public Test(){  
        System.out.println("执行无参构造函数...");  
    }  
      
    /** 
     * 有参构造函数 
     * @param id  id 
     */  
    public Test(String id){  
        System.out.println("执行有参构造函数...");  
    }  
    
    
    public static void main(String[] args) {  
    	    try {
    	        //类被加载之后，jvm已经获得了一个描述类结构的Class实例
    	    	//但是还需要进行类初始化操作之后才能正常使用此类，类初始化操作就是执行一遍类的静态语句，包括静态变量的声明还有静态代码块。
				Class.forName("com.huiy.javaimprove.codeblock.Test");//加载类，并且初始化它
	            System.out.println("----------------");  
//				new Test();  
//	            System.out.println("----------------");  
//	            new Test("1");  
			} catch (Exception e) {
				e.printStackTrace();
			}
            
    }  
}
