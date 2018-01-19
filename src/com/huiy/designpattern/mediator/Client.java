package com.huiy.designpattern.mediator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 * ��ͣ��ģʽ��װ��һϵ�ж����໥���õķ�ʽ��ʹ����Щ���󲻱��໥��������
 * �Ӷ�ʹ���ǿ��Խ���ɢ�����
 * 
 */

public class Client {

    public static void main(String[] args) {
        //������ͣ�ߡ�������
        MainBoard mediator = new MainBoard();
        //����ͬ����
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);
        //�õ�ͣ��֪������ͬ��
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        //��ʼ����Ӱ���ѹ��̷��������������ʼ����
        cd.readCD();
        
    }

}
