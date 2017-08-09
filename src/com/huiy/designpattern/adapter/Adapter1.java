package com.huiy.designpattern.adapter;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月1日
 * @version 1.0
 *
 *
 */
//对象适配器 它不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式
public class Adapter1 implements Target {
	
	Adaptee adaptee;
	
	public Adapter1(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	// 适配器类，继承了被适配类，同时实现标准接口 
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
