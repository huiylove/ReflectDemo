package com.huiy.designpattern.mediator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public interface Mediator {
    /**
     * ͬ�¶���������ı��ʱ����֪ͨ��ͣ�߷���
     * �õ�ͣ��ȥ������Ӧ��������ͬ�¶���Ľ���
     */
    public void changed(Colleague c);
}
