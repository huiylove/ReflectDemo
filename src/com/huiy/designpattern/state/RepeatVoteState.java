package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //�ظ�ͶƱ����ʱ��������
        System.out.println("�벻Ҫ�ظ�ͶƱ");
    }

}
