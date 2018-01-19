package com.huiy.designpattern.memento;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * ����¼������һ�������洢����һ�������ڲ�״̬�Ŀ��յĶ���
 * ����¼ģʽ���������ڲ��ƻ���װ�������£���һ�������״̬��׽(Capture)ס�����ⲿ�����洢������
 * �Ӷ������ڽ������ʵ�ʱ����������ԭ���洢������״̬��
 * ����¼ģʽ����������ģʽ�͵�����ģʽһͬʹ�á�
 */
public class Client {

    public static void main(String[] args) {
        
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        //�ı为���˶����״̬
        o.setState("On");
        //��������¼���󣬲��������˶����״̬��������
        c.saveMemento(o.createMemento());
        //�޸ķ����˵�״̬
        o.setState("Off");
        //�ָ������˶����״̬
        o.restoreMemento(c.retrieveMemento());
        
        System.out.println(o.getState());
    }

}
