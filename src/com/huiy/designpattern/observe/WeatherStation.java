package com.huiy.designpattern.observe;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��27��
 * @version 1.0
 *
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŀ�����-״̬�ı��֪ͨ���еĹ۲���
		WeatherData weatherData = new WeatherData();
		  
		//һ��ָ�����Ŀ���������ã��Լ�һЩ�йع۲��ߵ�״̬����Щ״̬��Ŀ�����Ҫһ�¡�
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
      
      
        weatherData.setMeasurements(80, 65, 30.4f);  
        weatherData.setMeasurements(82, 70, 29.2f);  
        weatherData.setMeasurements(78, 78, 40.4f);  
	}

}
