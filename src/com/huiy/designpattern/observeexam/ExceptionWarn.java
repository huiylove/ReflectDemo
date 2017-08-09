package com.huiy.designpattern.observeexam;

import java.util.ArrayList;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 * 实现主题接口-具体主题-一个主题有多个观察者
 * 在具体主题发生改变时，给所有的观察者发出通知。
 *
 */
public class ExceptionWarn implements Subject{
	
    private List<Observer> observers = new ArrayList<Observer>();;  


	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void removeOberver(Observer observer) {
		int i = observers.indexOf(observer);  
        if(i >= 0){  
            observers.remove(i);  
        }  
	}

	@Override
	public void notifyObserver() {
		 for(int i = 0; i < observers.size();i++){  
	            Observer observer = observers.get(i);  
	            observer.update();  
	        }  
		
	}

    
}
