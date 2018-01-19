package com.huiy.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 * ��̬�ĵ����䡪����̬���ɽ����ῼ�ǵ������Ľ����ߵ�����
 * ��̬�Ķ���䡪�������ط����ķ��ɻῼ�ǵ������Ľ����ߵ������Լ����������в��������� 
 * һ������������������������������ִ�в�ͬ�Ĵ��룬����ǡ�˫�ط��ɡ�
 */

public class ObjectStructure {
    
    private List<Node> nodes = new ArrayList<Node>();
    
    /**
     * ִ�з�������
     */
    public void action(Visitor visitor){
        
        for(Node node : nodes)
        {
            node.accept(visitor);
        }
        
    }
    /**
     * ���һ����Ԫ��
     */
    public void add(Node node){
        nodes.add(node);
    }
}