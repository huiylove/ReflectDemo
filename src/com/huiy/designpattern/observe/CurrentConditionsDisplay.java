package com.huiy.designpattern.observe;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月27日
 * @version 1.0
 * 布告板--实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态相协调。
 *
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{  
	
    private float temperature;  
    private float humidity;
    private float pressure; 
    private Subject weatherData;  
      
    public CurrentConditionsDisplay(Subject weatherData){  
        this.weatherData = weatherData;  
        weatherData.registerObserver(this);      //注册观察者  
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

