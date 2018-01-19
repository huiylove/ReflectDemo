package com.huiy.designpattern.composite;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
   * ����Ҷ����(Leaf)��ɫ��
 */
public class Leaf implements Component {
    /**
     * Ҷ�Ӷ��������
     */
    private String name;
    /**
     * ���췽��������Ҷ�Ӷ��������
     * @param name Ҷ�Ӷ��������
     */
    public Leaf(String name){
        this.name = name;
    }
    /**
     * ���Ҷ�Ӷ���Ľṹ��Ҷ�Ӷ���û���Ӷ���Ҳ�������Ҷ�Ӷ��������
     * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
     */
    @Override
    public void printStruct(String preStr) {
        // TODO Auto-generated method stub
        System.out.println(preStr + "-" + name);
    }

}
