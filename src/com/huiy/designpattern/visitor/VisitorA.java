package com.huiy.designpattern.visitor;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
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
