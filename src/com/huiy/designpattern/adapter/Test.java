package com.huiy.designpattern.adapter;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月1日
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		 // 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        //使用特殊功能类，即适配类  
        Target adapter = new Adapter();  
        adapter.request(); 
        
     // 使用特殊功能类，即适配类  
        Target adapter1 = new Adapter1(new Adaptee());  
        adapter1.request(); 
	}

}
