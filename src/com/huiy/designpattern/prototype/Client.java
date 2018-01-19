package com.huiy.designpattern.prototype;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class Client {
	 /**
     * ������Ҫʹ�õ�ԭ�ͽӿڶ���
     */
    private Prototype prototype;
    
    private Prototype copy;

    
    public Client(){
    }
    
    /**
     * ���췽����������Ҫʹ�õ�ԭ�ͽӿڶ���
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    
    
    public void operation(Prototype example){
        //��Ҫ����ԭ�ͽӿڵĶ���
    	copy = prototype.clone();
    }
    
    
    
    public static void main(String[] args){
    	ConconcretePortotype1 cp1 = new ConconcretePortotype1();
    	Client client = new Client(cp1);
    	client.operation(cp1);
    	System.out.println("ԭ�ͱ������¡�Ƿ�һ��"+(client.copy==client.prototype));
    }

}
