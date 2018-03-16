package com.huiy.javaimprove.clone;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月15日
 * @version 1.0
 */
public class PersonClone implements Cloneable{
	 /** 姓名 **/  
   private String name;  
     
   /** 电子邮件 **/  
   private EmailClone email;  
 
   public String getName() {  
       return name;  
   }  
 
   public void setName(String name) {  
       this.name = name;  
   }  
 
   public EmailClone getEmailClone() {  
       return email;  
   }  
 
   public void setEmailClone(EmailClone email) {  
       this.email = email;  
   }  
     
   public PersonClone(String name,EmailClone email){  
       this.name  = name;  
       this.email = email;  
   }  
     
   public PersonClone(String name){  
       this.name = name;  
   }  
 
   protected PersonClone clone() {  
	   PersonClone person = null;  
       try {  
           person = (PersonClone) super.clone();
           person.email = (EmailClone) email.clone();
//           person.setEmail(new Email(person.getEmail().getTitle(),person.getEmail().getContent()));  
       } catch (CloneNotSupportedException e) {  
           e.printStackTrace();  
       }  
         
       return person;  
   }  
   
}