package com.huiy.designpattern.chainexam;
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
	
	 /* 
     * 	���㹤�ʵ�˰ 
     */  
    public abstract double handleRequest(double pay,double panyh);  
	 
    
    public Handler getSuccessor(){
    	return successor;
    }
    
    public void setSuccessor(Handler hanlder){
    	this.successor = hanlder;
    }
    
    
}

