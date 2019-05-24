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
public class Person implements Serializable,Cloneable{
	 /** ���� **/  
    private String name; 
    
    private int age;
      
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
      
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age, Email email){  
        this.name  = name; 
        this.age = age;
        this.email = email;  
    }  
      
    public Person(String name){  
        this.name = name;  
    }  
  
    protected Person clone() {  
        Person person = null;  
        try {  
            person = (Person) super.clone();//调用Object类的clone方法完成浅拷贝
//            person.setEmail(new Email(person.getEmail().getTitle(),person.getEmail().getContent()));  
        } catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
          
        return person;  
    }  
    
}
