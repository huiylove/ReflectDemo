package com.huiy.concurrency.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��3��5��
 * @version 1.0
 */
public class CounterDemo1 {
	 
    private final ConcurrentHashMap<String, Long> urlCounter = new ConcurrentHashMap<String,Long>();
 
    //�ӿڵ��ô���+1
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
                //��ʼ���ɹ����˳�ѭ��
                if (urlCounter.putIfAbsent(url, 1l) == null)
                    break;
                //�����ʼ��ʧ�ܣ�˵�������߳��Ѿ���ʼ������
            } else {
                newValue = oldValue + 1;
                //+1�ɹ����˳�ѭ��
                if (urlCounter.replace(url, oldValue, newValue))
                    break;
                //���+1ʧ�ܣ�˵�������߳��Ѿ��޸Ĺ��˾�ֵ
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
        //�ȴ������߳�ͳ����ɺ�������ô���
        System.out.println("���ô�����"+counterDemo.getCount(url));
    }
}
 
