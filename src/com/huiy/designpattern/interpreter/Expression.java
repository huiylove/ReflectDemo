package com.huiy.designpattern.interpreter;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public abstract class Expression {
    /**
     * �Ի���Ϊ׼�����������͸������κ�һ�����ʽ
     */
    public abstract boolean interpret(Context ctx);
    /**
     * �����������ʽ�ڽṹ���Ƿ���ͬ
     */
    @Override
	public abstract boolean equals(Object obj);
    /**
     * ���ر��ʽ��hash code
     */
    @Override
	public abstract int hashCode();
    /**
     * �����ʽת�����ַ���
     */
    @Override
	public abstract String toString();
}
