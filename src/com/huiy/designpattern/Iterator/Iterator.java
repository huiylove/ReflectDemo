package com.huiy.designpattern.Iterator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public interface Iterator {

	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();

}
