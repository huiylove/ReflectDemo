package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * 
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //��¼�������У���ֹ��¼ϵͳ
        System.out.println("���������������ֹ��¼��ʹ�ñ�ϵͳ");
    }

}