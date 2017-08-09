package com.huiy.designpattern.producerAconsumer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
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
