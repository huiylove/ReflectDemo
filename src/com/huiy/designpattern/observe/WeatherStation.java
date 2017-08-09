package com.huiy.designpattern.observe;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月27日
 * @version 1.0
 *
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//目标对象-状态改变会通知所有的观察者
		WeatherData weatherData = new WeatherData();
		  
		//一个指向具体目标对象的引用，以及一些有关观察者的状态，这些状态与目标对象要一致。
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
      
      
        weatherData.setMeasurements(80, 65, 30.4f);  
        weatherData.setMeasurements(82, 70, 29.2f);  
        weatherData.setMeasurements(78, 78, 40.4f);  
	}

}
