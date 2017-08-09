package com.huiy.designpattern.producerAconsumer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class TestProduct implements Runnable{
	
	TestQueue obj;  
    
    public TestProduct(TestQueue tq){  
        this.obj=tq;  
    }  
      
    public void run() {  
        for(int i=0;i<10;i++){  
            try {  
                obj.product("test"+i);  
            } catch (Exception e) {               
                e.printStackTrace();  
            }  
        }  
    }  
}
