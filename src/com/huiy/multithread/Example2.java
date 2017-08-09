package com.huiy.multithread;

import java.util.concurrent.TimeUnit;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��30��
 * @version 1.0
 *
 *
 */
public class Example2 {
	
	private final Object object;
	 
    public Example2(Object object) {
        this.object = object;
    }
 
    public void exec() {
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.printf("%s,object%d\n", Thread.currentThread().getName(), i);
            }
        }
 
    }
}
	  
	 
