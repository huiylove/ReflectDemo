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
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��24��
 * @version 1.0
 */
public class CollectionDemo {
	
	public static void main(String[] args) {
		//���������ȷ������Ԫ�صĶ��٣����ָ��һ����ʼ����ֵ���������Ľ������ݲ������˷�ʱ�䡢Ч��
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
