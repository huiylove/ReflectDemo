package com.huiy.javaimprove.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年4月28日
 * @version 1.0
 *
 *
 */
public class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}

	public static void main(String[] args){
		List<String> list =  new ArrayList<String>();
		list.add("a");
		list.add("b");
		Collections.sort(list,new StringComparator());
	}
}
