package com.huiy.designpattern.state;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月18日
 * @version 1.0
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}