package com.huiy.javastatic;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��11��22��
 * @version 1.0
 * �ڲ���
 * ����ĳ����Χ����ڲ������ʱ����ʱ�ڲ������ض��Ჶ��һ��ָ���Ǹ���Χ����������
 * �Ǿ�̬�ڲ����ڱ������֮��������ر�����һ�����ã���������ָ�򴴽�������Χ��
 * 
 * static class �� no static class������
 * 1���ڲ���̬�಻��Ҫ��ָ���ⲿ������ã��Ǿ�̬�ڲ�����Ҫ���ж��ⲿ�������
 * 2���ڲ���̬��ֻ�ܷ����ⲿ��ľ�̬��Ա���Ǿ�̬�ڲ�������ⲿ������г�Ա
 * 3���ڲ���̬����������ⲿ�౻�������Ǿ�̬�ڲ��಻�������ⲿ��ʵ�屻����
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
		System.out.println("�ⲿ�෽��--");
	}
	
	public static void outerStaticMethod(){
		System.out.println("�ⲿ�ྲ̬����--");
	}

	public void display(){ 
		this.new InnerClass().display();//�Ǿ�̬�ڲ��ౣ����һ���ⲿ������ã�Ĭ��Ϊthis
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
            System.out.println("name��" + getName() +"   ;age��" + getAge());  
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
