package com.huiy.designpattern.chainofresponsibility;
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
	
	 /* 示意处理请求的方法，虽然这个示意方法是没有传入参数的 
     * 	但实际是可以传入参数的，根据具体需要来选择是否传递参数 
     */  
    public abstract void handleRequest();  
	 
    public Handler getSuccessor(){
    	return successor;
    }
    
    public void setSuccessor(Handler hanlder){
    	this.successor = hanlder;
    }
}

