package com.huiy.javastatic;
/** 
 * @author : yuanhui 
 * @date   : 2018年3月14日
 * @version 1.0
 * 这个牵涉到static属性在类中的加载时间和非静态代码块的运行时间；
1. final 修饰的变量只能一次赋值，其后不能改变；
   final修饰变量后，可以不用立即赋值，对于static final同时修饰的类变量可以在静态代码块中赋值，
        对于只有final修饰的类的非静态变量可以在非静态代码块或该类所有构造函数中赋值；
2. 为什么不能在非静态代码块中赋值
       类加载的时候会将静态的类变量加载到方法区，该情况下，对于还没有被初始化的static final变量，java认为是有错误的；
       使用非静态代码块赋值不行的原因是，非静态代码块运行时在对象建立时才运行，晚于类静态变量加载进方法区的时间；
 * 
 * 自己的理解：
 * static final变量只能在静态代码块中赋值     static变量在类加载的时候就完成了内存分配和初始化
 * final修饰的类的非静态变量可以在非静态代码块或该类所有构造函数中赋值
 * 非静态代码块运行时在对象建立时才运行，晚于类静态变量加载进方法区的时间；
 * 
 * java变量在使用前必须初始化
 * 1.尤其是在方法中声明的局部变量，必须得由手动进行显示的初始化
   2.而声明在类体中的成员变量，虚拟机会自动帮你初始化 为各种 0 值（数值类型为0 字符则为编码为0的那个 boolean 为false（编码还是0）引用型初始化为null）
             比较特殊的一种变量final（这里叫常量了 一旦赋值初始化之后就不能更改 ）这种变量想想也知道必须手动赋值初始化了，（虚拟机给你赋值个0有啥用呢？你又不能改它的值），
            于是再按照上述1、2的原则，
     1.局部的final型变量还是只要在使用前进行手动初始化即可
     2.final成员变量要么你在声明的时候就赋值了，
             要么你在声明的时候没赋值的话，就必须在所在的类实例化的时候就赋值了（即必须在所有的构造方法中初始化了）
 * 
 */
public class MethodInvokeTest {
	private static int s_value;
	private static final int sf_value;
	private final int f_value;
	
	static{
		System.out.println("静态代码块赋值前"+s_value);
		sf_value = 2;
		System.out.println("静态代码块赋值后"+sf_value);
	}
	
	{
		f_value = 3;
		System.out.println("非静态代码块赋值后"+f_value);

	}

	public MethodInvokeTest(){
//		f_value = 4;
	}
	
	public  void M(){
		System.out.println("实例方法M");
	}
	
	public static void staticM(){
		MethodInvokeTest test = new MethodInvokeTest();
		test.M();
		s_value = 6;
		System.out.println("动态地给静态变量赋值后"+s_value);
		System.out.println("静态方法M");
	}

	public static void staticM1(){
		staticM();
		System.out.println("静态方法M1");
	}
	
	public static void main(String[] args) {
//		staticM();
//	
		
	}
	

}
