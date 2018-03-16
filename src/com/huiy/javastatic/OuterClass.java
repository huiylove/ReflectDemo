package com.huiy.javastatic;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年11月22日
 * @version 1.0
 * 内部类
 * 创建某个外围类的内部类对象时，此时内部类对象必定会捕获一个指向那个外围类对象的引用
 * 非静态内部类在编译完成之后会隐含地保存着一个引用，该引用是指向创建它的外围类
 * 
 * static class 与 no static class的区别
 * 1、内部静态类不需要有指向外部类的引用，非静态内部类需要持有对外部类的引用
 * 2、内部静态类只能访问外部类的静态成员，非静态内部类可以外部类的所有成员
 * 3、内部静态类可以脱离外部类被创建，非静态内部类不能脱离外部类实体被创建
 * 
 * 
 */
public class OuterClass {  
	private String name ;  
    private int age;  
    private static int outer;
  
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

	public void outerMethod(){
		System.out.println("外部类方法--");
	}
	
	public static void outerStaticMethod(){
		System.out.println("外部类静态方法--");
	}

	public void display(){ 
		this.new InnerClass().display();//非静态内部类保存了一个外部类的引用，默认为this
        System.out.println("OuterClass...");  
    }  
	
	public class InnerClass{  
        public InnerClass(){  
            name = "chenssy";  
            age = 23;  
        }  
          
        public void display(){  
        	outerMethod();
        	outerStaticMethod();
            System.out.println("name：" + getName() +"   ;age：" + getAge());  
        }  
        
        public OuterClass getOuterClass(){  
            return OuterClass.this;  
        }  
    }  
    
	public static class StaticInnnerClass{
		public StaticInnnerClass(){
			System.out.println("outer--"+outer);
		}
		
		public void staticInnerMethod(){
			outerStaticMethod();
			System.out.println("StaticInnerClass");
		}
	}
      
    public static void main(String[] args) {  
        OuterClass outerClass = new OuterClass();  
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();  
        innerClass.getOuterClass().display();  
        OuterClass.StaticInnnerClass staticinnerClass = new OuterClass.StaticInnnerClass();
        staticinnerClass.staticInnerMethod();
        
    }  
}  
