package com.huiy.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月27日
 * @version 1.0
 *  实现主题接口-具体主题-一个主题有多个观察者
 *  在具体主题发生改变时，给所有的观察者发出通知。
 */
public class WeatherData implements Subject{  
	
    private List<Observer> observers;  
    private float tempterature;  
    private float pressure;  
    private float humidity;  
      
    public WeatherData(){  
        observers = new ArrayList<Observer>();  
    }  
      
    @Override  
    public void notifyObserver() {  
        for(int i = 0; i < observers.size();i++){  
            Observer observer = observers.get(i);  
            observer.update(tempterature, humidity, pressure);  
        }  
    }  
  
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
  
    /** 
     * 气象站得到更新的观测数据时，通知观察者 
     */  
    public void measurementChanged(){  
        notifyObserver();  
    }  
      
    public void setMeasurements(float temperature,float humidity,float pressure){  
        this.tempterature = temperature;  
        this.humidity = humidity;  
        this.pressure = pressure;  
        measurementChanged();  
    }  
}  

	    

