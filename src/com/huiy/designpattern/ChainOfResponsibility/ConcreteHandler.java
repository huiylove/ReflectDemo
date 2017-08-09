package com.huiy.designpattern.ChainOfResponsibility;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月5日
 * @version 1.0
 *
 *
 */
public class ConcreteHandler extends Handler {
	
	private String name;
	
	ConcreteHandler(String name){
		this.name = name;
	}

	@Override
	public void handleRequest() {
		/** 
         * 判断是否有后继的责任对象 
         * 如果有，就转发请求给后继的责任对象 
         * 如果没有，则处理请求 
         */  
        if(getSuccessor() != null)  
        {              
            System.out.println("放过请求");
            System.out.println("--------"+this.name);
            getSuccessor().handleRequest();  //交给后续级别的处理
        }else  
        {              
            System.out.println("----"+this.name);
            System.out.println("处理请求");  
        }  

	}
	
	

}
