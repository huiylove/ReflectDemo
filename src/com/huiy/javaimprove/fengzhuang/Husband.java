package com.huiy.javaimprove.fengzhuang;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class Husband {
	/* 
     * �����Եķ�װ 
     * һ���˵��������Ա����䡢���Ӷ�������˵�˽������ 
     */  
    private String name ;  
    private String sex ;  
    private int age ;  
    private Wife wife;  
      
    /* 
     * setter()��getter()�Ǹö�����⿪���Ľӿ� 
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
