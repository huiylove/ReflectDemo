package com.huiy.designpattern.observe;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��27��
 * @version 1.0
 * ��������
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
