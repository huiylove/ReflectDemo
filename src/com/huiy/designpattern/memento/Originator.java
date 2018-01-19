package com.huiy.designpattern.memento;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * �����˽�ɫ�࣬�����˽�ɫ����һ���´����ı���¼�����Լ����ڲ�״̬�洢������
 */
public class Originator {

    private String state;
    
    /**
     * ��������������һ���µı���¼����
     */
    public Memento createMemento(){
        return new Memento(state);
    }
    
    /**
     * �������˻ָ�������¼���������ص�״̬
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
        System.out.println("��ǰ״̬��" + this.state);
    }
    
}
