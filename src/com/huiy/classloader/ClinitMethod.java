package com.huiy.classloader;

/**
 * @author huiylove
 * @date 2019年5月14日
 * 1.<clinit>()方法是由编译器自动收集类中的所有类变量的赋值动作和静态语句块static{}中的语句合并产生的，编译器收集的顺序是由语句在源文件中出现的顺序所决定的。
 * 2.<clinit>()方法与实例构造器<init>()方法不同，它不需要显示地调用父类构造器
 *   虚拟机会保证在子类<clinit>()方法执行之前，父类的<clinit>()方法方法已经执行完毕
 * 3.执行接口的<clinit>()方法不需要先执行父接口的<clinit>()方法
 *   只有当父接口中定义的变量使用时，父接口才会初始化。另外，接口的实现类在初始化时也一样不会执行接口的<clinit>()方法
 * 4.同一个类加载器下，一个类只会初始化一次,<clinit>()只会执行一次
 * 
 * 初始化阶段
 * 何时开始类的初始化
 * 主动引用
 * 1.创建类的实例
   2.访问类的静态变量(除常量【被final修辞的静态变量】原因:常量一种特殊的变量，因为编译器把他们当作值(value)而不是域(field)来对待。如果你的代码中用到了常变量(constant variable)，编译器并不会生成字节码来从对象中载入域的值，而是直接把这个值插入到字节码中。这是一种很有用的优化，但是如果你需要改变final域的值那么每一块用到那个域的代码都需要重新编译。
   3.访问类的静态方法
   4.反射如(Class.forName("my.xyz.Test"))
   5.当初始化一个类时，发现其父类还未初始化，则先触发父类的初始化（接口初始化并不要求其父接口完成了初始化）
   6.虚拟机启动时，定义了main()方法的那个类先初始化
 * 被动引用
 * 1.子类调用父类的静态变量，子类不会被初始化，只有父类被初始化。对于静态字段，只有直接定义这个字段的类才会被初始化 
 * 2.通过数组定义来引用类，不会触发类的初始化
 * 3.访问类的常量，不会初始化类
 */
public class ClinitMethod {
    	
	static
    {
        i=0;
        //System.out.println(i);//这句编译器会报错：Cannot reference a field before it is defined（非法向前应用）
    }
	
    static int i = 1;
	
	public static void main(String[] args) {
		System.out.println(ClinitMethod.i);
	}

}
