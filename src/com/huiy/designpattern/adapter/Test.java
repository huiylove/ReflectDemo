package com.huiy.designpattern.adapter;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��1��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		 // ʹ����ͨ������  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        //ʹ�����⹦���࣬��������  
        Target adapter = new Adapter();  
        adapter.request(); 
        
     // ʹ�����⹦���࣬��������  
        Target adapter1 = new Adapter1(new Adaptee());  
        adapter1.request(); 
	}

}
