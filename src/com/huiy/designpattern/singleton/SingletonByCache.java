package com.huiy.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/** 
 *  ����˼��ʵ�ֵ���ģʽ
 * @author : yuanhui 
 * @date   : 2018��3��9��
 * @version 1.0
 */
public class SingletonByCache {
	    
	    private final static String DEFAULT_KEY = "One";
	    
	    private static Map<String,SingletonByCache> map = new HashMap<String,SingletonByCache>();
	    
	    private SingletonByCache(){
	        //
	    }
	    
	    
	    public static SingletonByCache getInstance(){	        //�ȴӻ����л�ȡ
	        SingletonByCache instance = (SingletonByCache)map.get(DEFAULT_KEY);
	        //���û�У����½�һ����Ȼ�����ûػ�����
	        if(instance==null){
	            instance = new SingletonByCache();
	            map.put(DEFAULT_KEY, instance);
	        }
	        //����о�ֱ��ʹ��
	        return instance;	    
	     }
}
