package com.huiy.designpattern.memento.selfpattern;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * �ڡ�������ʷ��ģʽ���棬�����˽�ɫ�Լ����θ����˽�ɫ
 * 
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        //�޸�״̬
        o.changeState("state 0");
        //��������¼
        MementoIF memento = o.createMemento();
        //�޸�״̬
        o.changeState("state 1");
        //���ձ���¼�ָ������״̬
        o.restoreMemento(memento);
    }

}
