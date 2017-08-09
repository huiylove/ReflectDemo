package com.huiy.designpattern.producerAconsumer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
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
