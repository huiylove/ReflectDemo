package com.huiy.javaimprove.innerclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年11月22日
 * @version 1.0
 * 内部类
 * 创建某个外围类的内部类对象时，此时内部类对象必定会捕获一个指向那个外围类对象的引用
 * 非静态内部类在编译完成之后会隐含地保存着一个引用，该引用是指向创建它的外围内
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
            System.out.println("name：" + getName() +"   ;age：" + getAge());  
        }  
        
        public OuterClass getOuterClass(){  
            return OuterClass.this;  
        }  
    }  
    
	public void display(){ 
		this.new InnerClass().display();//非静态内部类保存了一个外部类的引用，默认为this
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
