package com.huiy.designpattern.adapter;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月1日
 * @version 1.0
 *
 *
 */
//类适配器，因为 Adapter 类既继承了 Adaptee （被适配类），也实现了 Target 接口（因为 Java 不支持多继承，所以这样来实现）
public class Adapter extends Adaptee implements Target {

	// 适配器类，继承了被适配类，同时实现标准接口 
	@Override
	public void request() {
		super.specificRequest();

	}

}
