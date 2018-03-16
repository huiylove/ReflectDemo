package com.huiy.springioc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class Test {
	 public static void main(String args[]){  
//        Resource input = new ClassPathResource("com/huiy/springioc/beans.xml");//Bean.xml的路径  
//  
//        System.out.println("resource is:" + input);  
//  
//        BeanFactory factory = new XmlBeanFactory(input);//把input扔到工厂里面去，这个工厂就能为你提供实例了（我也不知道能不能这样说）  
  
        ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/springioc/beans.xml");
        
//        System.out.println("context is:"+context);
//        Person person = (Person)context.getBean("Person");
////        Person person =(Person) factory.getBean("Person");//你要一个叫Person的东西，那好，工厂就去找“Person"给你  
//        Grade grade = (Grade)context.getBean("Grade");
////        Grade grade=(Grade)factory.getBean("Grade");  
//        System.out.println("姓名："+person.getName());//person可以调用里面相关的方法，就相当于new了一个Person一样  
//        System.out.println("年龄："+person.getAge());  
//        System.out.println("数学成绩："+grade.getMath());  
//        System.out.println("英语成绩："+grade.getEnglish());  
//        System.out.println("数学，英语总成绩："+person.getTotleGrade());  
        JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
        List<String> customList = jc.getCustomList();
//        Iterator<String> it = customList.iterator();
//        while(it.hasNext()){
//        	System.out.println(it.next());
//        }
//          JavaProperties jp = (JavaProperties)context.getBean("adminUser");
//          Properties email = jp.getEmail();
//          System.out.println(email.getProperty("admin"));
        Test test = new Test();
        test.instatiateMethod();
	  }  
	 
	 public static void staticMethod(){
		Test test = new Test();
	    test.instatiateMethod();
	 }
	 
	  public void instatiateMethod(){
		  System.out.println("dddd");
	  }
}
