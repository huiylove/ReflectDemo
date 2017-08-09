package com.huiy.designpattern.observe;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��27��
 * @version 1.0
 * �����--ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬������״̬��Э����
 *
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{  
	
    private float temperature;  
    private float humidity;
    private float pressure; 
    private Subject weatherData;  
      
    public CurrentConditionsDisplay(Subject weatherData){  
        this.weatherData = weatherData;  
        weatherData.registerObserver(this);      //ע��۲���  
    }  
      
    public void update(float temp, float humidity, float pressure) {  
        this.temperature = temp;  
        this.humidity = humidity;  
        this.pressure = pressure;  
        display();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("Current conditions:"+temperature+"F degrees and ");//+humidity+"% humidity");  
    }  
  
}  

