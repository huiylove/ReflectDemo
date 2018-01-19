package com.huiy.designpattern.visitor;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class NodeA extends Node {

	@Override
	public void accept(Visitor visit) {
		visit.visit(this);
	}


	public void operationA(){
		System.out.print("���ʽڵ�A");
	}
}
