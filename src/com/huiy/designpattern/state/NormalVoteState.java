package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //����ͶƱ����¼��ͶƱ��¼��
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("��ϲͶƱ�ɹ�");
    }

}