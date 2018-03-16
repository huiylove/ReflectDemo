package com.huiy.springioc;

import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月20日
 * @version 1.0
 *
 *
 */
//@Component("javaCollection")
public class JavaCollection {
	
	private List<String> customList;
	
    public List<String> getCustomList() {
		return customList;
	}

	public void setCustomList(List<String> customList) {
		this.customList = customList;
	}

	
}
