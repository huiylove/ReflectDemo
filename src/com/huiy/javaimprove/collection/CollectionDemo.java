package com.huiy.javaimprove.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月24日
 * @version 1.0
 */
public class CollectionDemo {
	
	public static void main(String[] args) {
		//如果我们明确所插入元素的多少，最好指定一个初始容量值，避免过多的进行扩容操作而浪费时间、效率
		List alist = new ArrayList(10);
		Iterator it = alist.iterator();
		if(it.hasNext()){
			System.out.println(it.next());
		}
		
		Set<String> set = new HashSet<String>();
		set.add("a");
		
		
		Stack s = new Stack();
		s.push("1");
		s.push(2);
		s.push(true);
		while(!s.empty()){
			System.out.println(s.pop());
		}
		
		Hashtable hashTable = new Hashtable();
		HashMap hashMap = new HashMap();
		ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<String,Object>();
		
		
		
	}
}
