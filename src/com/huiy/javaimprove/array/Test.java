package com.huiy.javaimprove.array;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 * 声明数组-int[] arr ,int arr[]
 * 分配空间-告诉计算机需要给该数组分配多少连续的空间，记住是连续的 arr = new int[10]
 * 赋值-数组的初始化
 * 处理-就是对数组元素进行操作  array[1]
 *
 */
public class Test {
   public static void main(String[] args){
	   int[] array = new int[8];//默认为0,如果是引用数据类型就为null  
	   int[] array3 = {1,2,3,5};
	   int[] array2 = new int[]{1,2,3,4,5,6};
	   System.out.println("array的父类是：" + array.getClass().getSuperclass());  
       System.out.println("array的类名是：" + array.getClass().getName());  //[I int类型的数组
       
//       System.out.println("Object:" + Object.class);  
//       System.out.println("Object[]:" + Object[].class);  
//       System.out.println("Object[][]:" + Object[][].class);  
//       System.err.println("Object[][][]:" + Object[][][].class);  
//       System.out.println("Object:" + Object.class);  
       
       Class clazz = array.getClass();     
       System.out.println(clazz.getDeclaredFields().length);     
       System.out.println(clazz.getDeclaredMethods().length);     
       System.out.println(clazz.getDeclaredConstructors().length);     
       System.out.println(clazz.getDeclaredAnnotations().length);     
       System.out.println(clazz.getDeclaredClasses().length);     
   }
}
