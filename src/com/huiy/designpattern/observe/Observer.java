package com.huiy.designpattern.observe;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月27日
 * @version 1.0
 *观察者接口
 */
public interface Observer {  
    public void update(float temp,float humidity,float pressure);  
}  