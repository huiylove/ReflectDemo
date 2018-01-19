package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 */
public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // ����ͶƱ��ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
        String str = voteManager.getMapVote().get(user);
        if(str != null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("���ж���ˢ����Ϊ��ȡ��ͶƱ�ʸ�");
    }

}
