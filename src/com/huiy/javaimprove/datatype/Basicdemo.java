package com.huiy.javaimprove.datatype;

/**
 * @author huiylove
 * @date 2019年3月29日
 * java的8大基本数据类型：byte、short、char、int、long、float、double
 * 
 * 
   (byte，short，char)--int--long--float--double
        注意，整数比浮点数低级。低级到高级可以自动转换。而高级到低级需要用代码强制转换，不强转会编译错误。

 * 在Java虚拟机中没有任何供boolean值专用的字节码指令，
 * Java语言表达式所操作的boolean值，在编译之后都使用Java虚拟机中的int数据类型来代替，而boolean数组将会被编码成Java虚拟机的byte数组，每个元素boolean元素占8位
 * boolean类型占了单独使用是4个字节，在数组中又是1个字节
 */
public class Basicdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//byte类型所占的字节数求法
        System.out.println("byte的二进制位数为：" + Byte.SIZE);
        System.out.println("byte所占的字节数为：" + Byte.SIZE/8);     //一个字节占8个二进制位        
        //short类型所占的字节数求法
        System.out.println("short的二进制位数为：" + Short.SIZE);
        System.out.println("short所占的字节数为：" + Short.SIZE/8);
        //char类型所占的字节数求法
        System.out.println("char的二进制位数为：" + Character.SIZE);
        System.out.println("char所占的字节数为：" + Character.SIZE/8);
        //int类型所占的字节数求法
        System.out.println("int的二进制位数为：" + Integer.SIZE);
        System.out.println("int所占的字节数为：" + Integer.SIZE/8);
        //long类型所占的字节数求法
        System.out.println("long的二进制位数为：" + Long.SIZE);
        System.out.println("long所占的字节数为：" + Long.SIZE/8);
        //float类型所占的字节数求法
        System.out.println("float的二进制位数为：" + Float.SIZE);
        System.out.println("float所占的字节数为：" + Float.SIZE/8);
        //double类型所占的字节数求法
        System.out.println("double的二进制位数为：" + Double.SIZE);
        System.out.println("double所占的字节数为：" + Double.SIZE/8);
     
        
	}

}
