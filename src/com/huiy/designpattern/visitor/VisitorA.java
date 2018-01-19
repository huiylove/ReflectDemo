package com.huiy.designpattern.visitor;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(NodeA node) {
		node.operationA();
	}

	@Override
	public void visit(NodeB node) {
		node.operationB();
	}

}
