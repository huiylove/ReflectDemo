package com.huiy.designpattern.producerAconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
 * @version 1.0
 *
 *
 */
public class TestQueue {
	
	public static Object signal = new Object();  
    boolean bFull = false;   
    private List thingsList = new ArrayList();   
    private final ReentrantLock lock = new ReentrantLock(true);  
    BlockingQueue q = new ArrayBlockingQueue(10);  
    
    /** 
     * ���� 
     * @param thing 
     * @throws Exception 
     */  
    public void product(String thing) throws Exception{   
        synchronized(signal){  
            if(!bFull){  
                bFull = true;  
                //����һЩ�������ŵ� thingsList ������Դ��  
                System.out.println("product");  
                System.out.println("�ֿ����������ȴ�����...");   
                thingsList.add(thing);   
                signal.notify(); //Ȼ��֪ͨ������  
            }            
            signal.wait(); // Ȼ���Լ�����signal���ٶ���  
              
        }  
    }  
      
    /** 
     * ���� 
     * @return 
     * @throws Exception 
     */  
    public String consumer()throws Exception{             
        synchronized(signal){  
            if(!bFull)  {    
                signal.wait(); // ����signal���ٶ��У��ȴ������ߵ�֪ͨ  
            }  
            bFull=false;   
            // ��ȡbuf ������Դ����Ķ���  
            System.out.println("consume");  
            System.out.println("�ֿ��ѿգ����ȴ�����...");   
            signal.notify(); // Ȼ��֪ͨ������  
        }  
        String result="";  
        if(thingsList.size()>0){  
            result=thingsList.get(thingsList.size()-1).toString();  
            thingsList.remove(thingsList.size()-1);  
        }  
        return result;  
    }  
}
