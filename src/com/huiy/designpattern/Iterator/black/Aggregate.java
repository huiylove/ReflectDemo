package com.huiy.designpattern.Iterator.black;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public abstract class Aggregate {

	/**
     * 工厂方法，创建相应迭代子对象的接口
     */
	public abstract Iterator createIterator();

}
