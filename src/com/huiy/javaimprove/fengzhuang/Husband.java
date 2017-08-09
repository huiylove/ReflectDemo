package com.huiy.javaimprove.fengzhuang;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class Husband {
	/* 
     * 对属性的封装 
     * 一个人的姓名、性别、年龄、妻子都是这个人的私有属性 
     */  
    private String name ;  
    private String sex ;  
    private int age ;  
    private Wife wife;  
      
    /* 
     * setter()、getter()是该对象对外开发的接口 
     */  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getSex() {  
        return sex;  
    }  
  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public void setWife(Wife wife) {  
        this.wife = wife;  
    }  
}
