package com.huiy.designpattern.builder;

import java.util.Date;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 * 
   * 　1. 一个部分是Builder接口，这里是定义了如何构建各个部件，
 *    也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
　　2. 另外一个部分是Director，Director是知道如何组合来构建产品，
              也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。

 */
public abstract class Builder {
	
	protected AutoMessage am;
	
	public  void buildTo(String to){
		am.setTo(to);
	};
	
	public void buildFrom(String from){
		am.setFrom(from);
	}
	
	public abstract void buildSubject();
	
	public abstract void buildBody();
	
	public  void buildDate(){
		am.setSendDate(new Date());
	}
	
	public  void sendMessage(){
		am.send();
	}
	

}
