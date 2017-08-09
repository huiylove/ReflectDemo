package com.huiy.designpattern.producerAconsumer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
 * @version 1.0
 *
 *
 */
public class TestConsumer implements Runnable{
	TestQueue obj;  
    
    public TestConsumer(TestQueue tq){  
        this.obj=tq;  
    }  
  
    public void run() {               
        try {  
            for(int i=0;i<10;i++){  
                obj.consumer();  
            }             
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
