package com.huiy.designpattern.observeexam;

import java.util.ArrayList;
import java.util.List;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 * ʵ������ӿ�-��������-һ�������ж���۲���
 * �ھ������ⷢ���ı�ʱ�������еĹ۲��߷���֪ͨ��
 *
 */
public class ExceptionWarn implements Subject{
	
    private List<Observer> observers = new ArrayList<Observer>();;  


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

	@Override
	public void notifyObserver() {
		 for(int i = 0; i < observers.size();i++){  
	            Observer observer = observers.get(i);  
	            observer.update();  
	        }  
		
	}

    
}
