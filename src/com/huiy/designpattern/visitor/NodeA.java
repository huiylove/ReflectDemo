package com.huiy.designpattern.visitor;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public class NodeA extends Node {

	@Override
	public void accept(Visitor visit) {
		visit.visit(this);
	}


	public void operationA(){
		System.out.print("访问节点A");
	}
}
