package com.huiy.javaimprove.mulitinherit;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��29��
 * @version 1.0
 *���������ǴӸ��ࡰ���⡱��ɢ�ģ�Ҳ���ǴӸ��࿪ʼ������һ��һ������ɹ�����
 *�������ǲ�û����ʾ�����ø���Ĺ�������
 *�����java�Ĵ���֮������������Ĭ�ϸ�������ø�����޲ι�����
 */
public class B extends A{
    B(){
    	super(3);//����Aû���޲εĹ�����������B����super()��ʾ���е��á�����B��Ĭ�ϵ��ø�����޲ι�����
    	System.out.println("B constructor");
    }
    
    B(int v){
    	super(3);//����Aû���޲εĹ�����������B����super()��ʾ���е��á�����B��Ĭ�ϵ��ø�����޲ι�����
    	System.out.println("B constructor"+v);
    }
    
    public static void main(String[] args){
    	B b = new B(3);
    }
}
