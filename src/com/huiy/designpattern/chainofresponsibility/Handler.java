package com.huiy.designpattern.chainofresponsibility;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��5��
 * @version 1.0
 *
 *
 */
public abstract class Handler {
	
	/* 
    * ���к�̵����ζ��� 
    */  
	protected Handler successor;
	
	 /* ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ����û�д�������� 
     * 	��ʵ���ǿ��Դ�������ģ����ݾ�����Ҫ��ѡ���Ƿ񴫵ݲ��� 
     */  
    public abstract void handleRequest();  
	 
    public Handler getSuccessor(){
    	return successor;
    }
    
    public void setSuccessor(Handler hanlder){
    	this.successor = hanlder;
    }
}

