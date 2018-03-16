package com.huiy.concurrency.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
 * @version 1.0
 */
public class CounterDemo1 {
	 
    private final ConcurrentHashMap<String, Long> urlCounter = new ConcurrentHashMap<String,Long>();
 
    //接口调用次数+1
    public long increase(String url) {
        Long oldValue = urlCounter.get(url);
        Long newValue = (oldValue == null) ? 1L : oldValue + 1;
        urlCounter.put(url, newValue);
        return newValue;
    }
 
    public long increase2(String url) {
        Long oldValue, newValue;
        while (true) {
            oldValue = urlCounter.get(url);
            if (oldValue == null) {
                newValue = 1l;
                //初始化成功，退出循环
                if (urlCounter.putIfAbsent(url, 1l) == null)
                    break;
                //如果初始化失败，说明其他线程已经初始化过了
            } else {
                newValue = oldValue + 1;
                //+1成功，退出循环
                if (urlCounter.replace(url, oldValue, newValue))
                    break;
                //如果+1失败，说明其他线程已经修改过了旧值
            }
        }
        return newValue;
    }
 
    public Long getCount(String url){
        return urlCounter.get(url);
    }
 
    
    public static void main(String[] args) {
    	CounterDemo1 counterDemo = new CounterDemo1();
    	final String url = "http://localhost:8080/hello";
        //等待所有线程统计完成后输出调用次数
        System.out.println("调用次数："+counterDemo.getCount(url));
    }
}
 
