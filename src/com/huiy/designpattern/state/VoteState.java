package com.huiy.designpattern.state;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��18��
 * @version 1.0
 * ����״̬��
 */
public interface VoteState {
    /**
     * ����״̬��Ӧ����Ϊ
     * @param user    ͶƱ��
     * @param voteItem    ͶƱ��
     * @param voteManager    ͶƱ�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ��
     *                         ���Իص������ĵ�����
     */
    public void vote(String user,String voteItem,VoteManager voteManager);
}