package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
 * @version 1.0
 *
 *
 */
public class StaticTest {
	 /** ���췽��*/  
    public StaticTest() {  
        System.out.println("���캯����ִ����!");  
    }  
    /** ��̬�����*/  
    static {  
        System.out.println("��̬����鱻ִ����!");  
        //show();  
    }  
    /** ��̬����*/  
    public static void show(){  
        System.out.println("��̬������ִ����!");  
    }  
}
