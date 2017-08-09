package com.huiy.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��27��
 * @version 1.0
 *  ʵ������ӿ�-��������-һ�������ж���۲���
 *  �ھ������ⷢ���ı�ʱ�������еĹ۲��߷���֪ͨ��
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
     * ����վ�õ����µĹ۲�����ʱ��֪ͨ�۲��� 
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

	    

