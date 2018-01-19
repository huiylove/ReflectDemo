package com.huiy.designpattern.command;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class ConcreteCommand implements Command {
	
	
    //������Ӧ�Ľ����߶���
    private Receiver receiver = null;
    
    /**
     * ���췽��
     */
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        //ͨ����ת�������߶������Ӧ�������ý�����������ִ�й���
        receiver.action();
    }

}
