package com.huiy.springioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
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
