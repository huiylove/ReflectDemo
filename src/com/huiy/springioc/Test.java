package com.huiy.springioc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class Test {
	 public static void main(String args[]){  
//        Resource input = new ClassPathResource("com/huiy/springioc/beans.xml");//Bean.xml��·��  
//  
//        System.out.println("resource is:" + input);  
//  
//        BeanFactory factory = new XmlBeanFactory(input);//��input�ӵ���������ȥ�������������Ϊ���ṩʵ���ˣ���Ҳ��֪���ܲ�������˵��  
  
        ApplicationContext context = new ClassPathXmlApplicationContext("com/huiy/springioc/beans.xml");
        
//        System.out.println("context is:"+context);
//        Person person = (Person)context.getBean("Person");
////        Person person =(Person) factory.getBean("Person");//��Ҫһ����Person�Ķ������Ǻã�������ȥ�ҡ�Person"����  
//        Grade grade = (Grade)context.getBean("Grade");
////        Grade grade=(Grade)factory.getBean("Grade");  
//        System.out.println("������"+person.getName());//person���Ե���������صķ��������൱��new��һ��Personһ��  
//        System.out.println("���䣺"+person.getAge());  
//        System.out.println("��ѧ�ɼ���"+grade.getMath());  
//        System.out.println("Ӣ��ɼ���"+grade.getEnglish());  
//        System.out.println("��ѧ��Ӣ���ܳɼ���"+person.getTotleGrade());  
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
