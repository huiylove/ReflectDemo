package com.huiy.designpattern.observeexam;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *  
 */
public interface Subject {
	
	
	 /** 
     * 注册观察者 
     * @param observer 
     */  
    public void registerObserver(Observer observer);  
      
    /** 
     * 删除观察者 
     * @param observer 
     */  
    public void removeOberver(Observer observer);  
      
    /** 
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者 
     */  
    public void notifyObserver();
}
