package com.huiy.designpattern.mediator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class SoundCard extends Colleague {
    /**
     * ���캯��
     */
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * ������Ƶ���ݷ�������
     */
    public void soundData(String data){
        System.out.println("��������" + data);
    }
}
