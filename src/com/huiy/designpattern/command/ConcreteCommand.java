package com.huiy.designpattern.command;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月18日
 * @version 1.0
 */
public class ConcreteCommand implements Command {
	
	
    //持有相应的接收者对象
    private Receiver receiver = null;
    
    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }

}
