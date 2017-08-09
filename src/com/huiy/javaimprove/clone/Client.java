package com.huiy.javaimprove.clone;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *把母对象写入到一个字节流中，再从字节流中将其读出来，这样就可以创建一个新的对象了，
 *并且该新对象与母对象之间并不存在引用共享的问题，真正实现对象的深拷贝
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//写封邮件  
        Email email = new Email("请参加会议","请与今天12:30到二会议室参加会议...");  
          
        Person person1 =  new Person("张三",email);  
          
        Person person2 =  CloneUtils.clone(person1); //person1.clone();  
        person2.setName("李四");  
        Person person3 =   CloneUtils.clone(person1);//person1.clone();  
        person3.setName("王五");  
          
        person1.getEmail().setContent("请与今天12:00到二会议室参加会议...");  
        
        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getContent());  
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getContent());  
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());  
	}

}
