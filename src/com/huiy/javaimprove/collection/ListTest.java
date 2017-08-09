package com.huiy.javaimprove.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月27日
 * @version 1.0
 *
 *
 */
public class ListTest {

	public static void main(String[] args) {
		//如果我们明确所插入元素的多少，最好指定一个初始容量值，避免过多的进行扩容操作而浪费时间、效率
		List alist = new ArrayList(10);
		Iterator it = alist.iterator();
		if(it.hasNext()){
			System.out.println(it.next());
		}
		
		Stack s = new Stack();
		s.push("1");
		s.push(2);
		s.push(true);
		while(!s.empty()){
			System.out.println(s.pop());
		}
		
	}

}
