package com.huiy.designpattern.mediator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public abstract class Colleague {
    //����һ����ͣ�߶���
    private Mediator mediator;
    /**
     * ���캯��
     */
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    /**
     * ��ȡ��ǰͬ�����Ӧ�ĵ�ͣ�߶���
     */
    public Mediator getMediator() {
        return mediator;
    }
}
