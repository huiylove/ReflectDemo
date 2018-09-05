package com.huiy.designpattern.visitor;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class NodeB extends Node {

	@Override
	public void accept(Visitor visit) {
		visit.visit(this);
	}


	public void operationB(){
		System.out.println("���ʽڵ�B");
	}
}
