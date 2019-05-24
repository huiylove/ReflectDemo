package com.huiy.javaimprove.clone;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *把母对象写入到一个字节流中，再从字节流中将其读出来，这样就可以创建一个新的对象了，
 *并且该新对象与母对象之间并不存在引用共享的问题，真正实现对象的深拷贝
 *
 *浅拷贝
 *①对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。因为是两份不同的数据，所以对其中一个对象的该成员变量值进行修改，不会影响另一个对象拷贝得到的数据。
 *②对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。
 * 因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
 * 
 * 基本数据类型是值传递，所以修改值后不会影响另一个对象的该属性值；
 * 引用数据类型是地址传递（引用传递），所以修改值后另一个对象的该属性值会同步被修改。
 * String类型非常特殊，String类型属于引用数据类型，不属于基本数据类型，但是String类型的数据是存放在常量池中的，也就是无法修改的！
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//写封邮件  
        Email email = new Email("请参加会议","请与今天12:30到二会议室参加会议...");  
          
        Person person1 =  new Person("张三",36,email);  
          
        Person person2 = (Person) person1.clone();//CloneUtils.clone(person1); //person1.clone();  
        person2.setName("李四");  
        person2.setAge(55);
//        Person person3 =   CloneUtils.clone(person1);//person1.clone();  
//        person3.setName("王五");  
           
        person1.getEmail().setContent("请与今天12:00到二会议室参加会议...");  
        
        System.out.println(person1.getName() + ""+person1.getAge()+"的邮件内容是：" + person1.getEmail().getContent());  
        System.out.println(person2.getName() + ""+person2.getAge()+"的邮件内容是：" + person2.getEmail().getContent());  
//        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());  
//        System.out.println(person4.getName() + "的邮件内容是：" + person4.getEmail().getContent());  
        
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a==b);
        modifyStr(c);
        System.out.println(c);
	}

	
	private static void modifyStr(String s){
		s = "bcd";
	}
}
