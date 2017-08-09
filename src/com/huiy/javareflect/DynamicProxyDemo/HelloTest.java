package com.huiy.javareflect.DynamicProxyDemo;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��15��
 * @version 1.0
 *
 *
 */
public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject rsub =  new RealSubject();
		HelloHandler  hellohandler = new HelloHandler(rsub);
        Subject proxySubject = (Subject)Proxy.newProxyInstance(rsub.getClass().getClassLoader(),rsub.getClass().getInterfaces(),hellohandler);
//		rsub.getClass().getInterfaces();
//      HelloHandler  hellohandler = new HelloHandler();
//		Subject proxySubject = (Subject) hellohandler.getProxy(rsub);
        proxySubject.hello();
        System.out.println("ProxyClass:"+proxySubject.getClass()+"SuperClass:"+proxySubject.getClass().getSuperclass());
        createProxyClassFile();   
	}
	
	
	 public static void createProxyClassFile()   
	  {   
	    String name = "proxySubject";   
	    byte[] data = ProxyGenerator.generateProxyClass(name, new Class[] { Subject.class } );   
	    try  
	    {   
	      FileOutputStream out = new FileOutputStream( name + ".class" );   
	      out.write( data );   
	      out.close();   
	    }   
	    catch( Exception e )   
	    {   
	      e.printStackTrace();   
	    }   
	  }   
}  

