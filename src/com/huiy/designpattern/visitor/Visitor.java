package com.huiy.designpattern.visitor;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public interface Visitor {
	public void visit(NodeA node);
	public void visit(NodeB node);

}
