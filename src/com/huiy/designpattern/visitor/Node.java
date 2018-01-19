package com.huiy.designpattern.visitor;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public abstract class Node {
   public abstract void accept(Visitor visit);
}
