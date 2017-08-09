package com.huiy.designpattern.chainexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月5日
 * @version 1.0
 *
 *
 */
public abstract class Handler {
	
	/* 
    * 持有后继的责任对象 
    */  
	protected Handler successor;
	
	 /* 
     * 	计算工资的税 
     */  
    public abstract double handleRequest(double pay,double panyh);  
	 
    
    public Handler getSuccessor(){
    	return successor;
    }
    
    public void setSuccessor(Handler hanlder){
    	this.successor = hanlder;
    }
    
    
}

