package com.huiy.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/** 
 *  缓存思想实现单例模式
 * @author : yuanhui 
 * @date   : 2018年3月9日
 * @version 1.0
 */
public class SingletonByCache {
	    
	    private final static String DEFAULT_KEY = "One";
	    
	    private static Map<String,SingletonByCache> map = new HashMap<String,SingletonByCache>();
	    
	    private SingletonByCache(){
	        //
	    }
	    
	    
	    public static SingletonByCache getInstance(){	        //先从缓存中获取
	        SingletonByCache instance = (SingletonByCache)map.get(DEFAULT_KEY);
	        //如果没有，就新建一个，然后设置回缓存中
	        if(instance==null){
	            instance = new SingletonByCache();
	            map.put(DEFAULT_KEY, instance);
	        }
	        //如果有就直接使用
	        return instance;	    
	     }
}
