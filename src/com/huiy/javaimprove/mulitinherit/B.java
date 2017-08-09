package com.huiy.javaimprove.mulitinherit;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月29日
 * @version 1.0
 *构建过程是从父类“向外”扩散的，也就是从父类开始向子类一级一级地完成构建。
 *而且我们并没有显示的引用父类的构造器，
 *这就是java的聪明之处：编译器会默认给子类调用父类的无参构造器
 */
public class B extends A{
    B(){
    	super(3);//父类A没有无参的构造器，子类B必须super()显示进行调用。子类B会默认调用父类的无参构造器
    	System.out.println("B constructor");
    }
    
    B(int v){
    	super(3);//父类A没有无参的构造器，子类B必须super()显示进行调用。子类B会默认调用父类的无参构造器
    	System.out.println("B constructor"+v);
    }
    
    public static void main(String[] args){
    	B b = new B(3);
    }
}
