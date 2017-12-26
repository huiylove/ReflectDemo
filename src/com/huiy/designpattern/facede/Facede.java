package com.huiy.designpattern.facede;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年8月3日
 * @version 1.0
 *
 * 门面角色类
 * 
 * 　使用门面模式还有一个附带的好处，就是能够有选择性地暴露方法
 */
public class Facede {
	
	//示意方法，满足客户端需要的功能  
    public void test(){  
        ModuleA a = new ModuleA();   
        a.testA();  
        ModuleB b = new ModuleB();  
        b.testB();  
        ModuleC c = new ModuleC();  
        c.testC();  
    }  
}
