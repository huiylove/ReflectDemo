package com.huiy.javaimprove.clone;

import java.io.Serializable;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public class Person implements Serializable{//implements Cloneable{
	 /** ���� **/  
    private String name;  
      
    /** �����ʼ� **/  
    private Email email;  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public Email getEmail() {  
        return email;  
    }  
  
    public void setEmail(Email email) {  
        this.email = email;  
    }  
      
    public Person(String name,Email email){  
        this.name  = name;  
        this.email = email;  
    }  
      
    public Person(String name){  
        this.name = name;  
    }  
  
//    protected Person clone() {  
//        Person person = null;  
//        try {  
//            person = (Person) super.clone();  
//            person.setEmail(new Email(person.getEmail().getTitle(),person.getEmail().getContent()));  
//        } catch (CloneNotSupportedException e) {  
//            e.printStackTrace();  
//        }  
//          
//        return person;  
//    }  
}
