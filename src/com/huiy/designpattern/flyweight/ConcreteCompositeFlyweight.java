package com.huiy.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class ConcreteCompositeFlyweight implements Flyweight {
    
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    
    /**
     * ����һ���µĵ�����Ԫ���󵽾ۼ���
     */
    public void add(Character key , Flyweight fly){
        files.put(key,fly);
    }
    
    /**
     * ����״̬��Ϊ�������뵽������
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;
        for(Object o : files.keySet()){
            fly = files.get(o);
            fly.operation(state);
        }
        
    }

}