package com.huiy.designpattern.Iterator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public interface Iterator {

	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();

}
