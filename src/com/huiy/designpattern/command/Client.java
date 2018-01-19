package com.huiy.designpattern.command;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //����������
        Receiver receiver = new Receiver();
        //������������趨���Ľ�����
        Command command = new ConcreteCommand(receiver);
        //���������ߣ�������������ý�ȥ
        Invoker invoker = new Invoker(command);
        //ִ�з���
        invoker.action();
    }

}
