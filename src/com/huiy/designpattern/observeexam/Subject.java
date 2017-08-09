package com.huiy.designpattern.observeexam;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *  
 */
public interface Subject {
	
	
	 /** 
     * ע��۲��� 
     * @param observer 
     */  
    public void registerObserver(Observer observer);  
      
    /** 
     * ɾ���۲��� 
     * @param observer 
     */  
    public void removeOberver(Observer observer);  
      
    /** 
     * ������״̬�����ı�ʱ�����������Ҫ�����ã���֪ͨ���й۲��� 
     */  
    public void notifyObserver();
}
