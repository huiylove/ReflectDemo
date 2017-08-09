package com.huiy.multithread;

import java.util.concurrent.TimeUnit;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月30日
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
	  
	 
