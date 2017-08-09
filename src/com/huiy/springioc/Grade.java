package com.huiy.springioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class Grade {
	
	private int math;  
    private int english;  
    public int getMath() {  
        return math;  
    }  
    public void setMath(int math) {  
        this.math = math;  
    }  
    public int getEnglish() {  
        return english;  
    }  
    public void setEnglish(int english) {  
        this.english = english;  
    }  
}
