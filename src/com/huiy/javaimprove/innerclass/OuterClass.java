package com.huiy.javaimprove.innerclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��11��22��
 * @version 1.0
 * �ڲ���
 * ����ĳ����Χ����ڲ������ʱ����ʱ�ڲ������ض��Ჶ��һ��ָ���Ǹ���Χ����������
 * �Ǿ�̬�ڲ����ڱ������֮��������ر�����һ�����ã���������ָ�򴴽�������Χ��
 */
public class OuterClass {  
	private String name ;  
    private int age;  
  
      
    public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public class InnerClass{  
        public InnerClass(){  
            name = "chenssy";  
            age = 23;  
        }  
          
        public void display(){  
            System.out.println("name��" + getName() +"   ;age��" + getAge());  
        }  
        
        public OuterClass getOuterClass(){  
            return OuterClass.this;  
        }  
    }  
    
	public void display(){ 
		this.new InnerClass().display();//�Ǿ�̬�ڲ��ౣ����һ���ⲿ������ã�Ĭ��Ϊthis
        System.out.println("OuterClass...");  
    }  
      
    public static void main(String[] args) {  
        OuterClass outerClass = new OuterClass();  
        InnerClass innerClass = outerClass.new InnerClass();  
        innerClass.getOuterClass().display();  
        Map map = new HashMap();
        Set set = map.entrySet();
    }  
}  
