package com.huiy.javareflect.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月15日
 * @version 1.0
 *
 *
 */
public class ProFileInit {
	
	public static Properties getPro() throws FileNotFoundException, IOException{
        Properties pro = new Properties();
        File f = new File("fruit.properties");
        if(f.exists()){
            pro.load(new FileInputStream(f));
        }else{
            pro.setProperty("apple", "com.huiy.javareflect.factory.Apple");
            pro.setProperty("orange", "com.huiy.javareflect.factory.Orange");
            pro.store(new FileOutputStream(f), "FRUIT CLASS");
        }
        return pro;
    }
}
