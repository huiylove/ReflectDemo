package com.huiy.springioc;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class Person {
	private String name;  
    private int age;  
    private Grade grade;  
    public String getName() {  
        return name;  
    }  
      
    public Grade getGrade() {  
        return grade;  
    }  
  
    public void setGrade(Grade grade) {  
        this.grade = grade;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public int getTotleGrade() {  
        return grade.getEnglish()+grade.getMath();  
    }  
}
