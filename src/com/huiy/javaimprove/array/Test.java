package com.huiy.javaimprove.array;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 * ��������-int[] arr ,int arr[]
 * ����ռ�-���߼������Ҫ�������������������Ŀռ䣬��ס�������� arr = new int[10]
 * ��ֵ-����ĳ�ʼ��
 * ����-���Ƕ�����Ԫ�ؽ��в���  array[1]
 *
 */
public class Test {
   public static void main(String[] args){
	   int[] array = new int[8];//Ĭ��Ϊ0,����������������;�Ϊnull  
	   int[] array3 = {1,2,3,5};
	   int[] array2 = new int[]{1,2,3,4,5,6};
	   System.out.println("array�ĸ����ǣ�" + array.getClass().getSuperclass());  
       System.out.println("array�������ǣ�" + array.getClass().getName());  //[I int���͵�����
       
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
