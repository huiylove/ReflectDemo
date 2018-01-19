package com.huiy.designpattern.memento;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * �����˽�ɫ�࣬�����˽�ɫ���𱣴汸��¼���󣬵��ǴӲ��޸ģ��������鿴������¼���������
 */
public class Caretaker {

    private Memento memento;
    
    /**
     * ����¼��ȡֵ����
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    
    /**
     * ����¼�ĸ�ֵ����
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}