package com.huiy.javareflect.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��15��
 * @version 1.0
 *
 *
 */
public class FruitByPro {
	 public static void main(String[] a) throws FileNotFoundException, IOException{
	        Properties pro = ProFileInit.getPro();
	        Fruit f = FruitFactory.getInstance(pro.getProperty("orange"));
	        if(f!=null){
	            f.eat();
	        }
	    }
}
