package com.huiy.designpattern.command;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class Invoker {
    /**
     * �����������
     */
    private Command command = null;
    /**
     * ���췽��
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * �ж�����
     */
    public void action(){
        command.execute();
    }
}
