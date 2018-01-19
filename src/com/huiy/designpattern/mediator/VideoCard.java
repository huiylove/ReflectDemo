package com.huiy.designpattern.mediator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class VideoCard extends Colleague {
    /**
     * ���캯��
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * ��ʾ��Ƶ����
     */
    public void showData(String data){
        System.out.println("�����ڹۿ����ǣ�" + data);
    }
}
