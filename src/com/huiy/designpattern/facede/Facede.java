package com.huiy.designpattern.facede;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��8��3��
 * @version 1.0
 *
 * �����ɫ��
 * 
 * ��ʹ������ģʽ����һ�������ĺô��������ܹ���ѡ���Եر�¶����
 */
public class Facede {
	
	//ʾ�ⷽ��������ͻ�����Ҫ�Ĺ���  
    public void test(){  
        ModuleA a = new ModuleA();   
        a.testA();  
        ModuleB b = new ModuleB();  
        b.testB();  
        ModuleC c = new ModuleC();  
        c.testC();  
    }  
}
