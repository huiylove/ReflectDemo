package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * ��״̬ģʽ�У�����(Context)�ǳ���״̬�Ķ��󣬵��ǻ���(Context)�����������״̬��ص���Ϊ��
         ���ǰѴ���״̬�Ĺ���ί�и���״̬��Ӧ��״̬������������
         �ھ����״̬�������о�����Ҫ��ȡ����(Context)��������ݣ� �����ڱ�Ҫ��ʱ���ص�����(Context)�ķ�����
         ��ˣ�ͨ��������(Context)������һ���������ݸ������״̬�����ࡣ
 */

public class Client {

    public static void main(String[] args) {
        
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }

}