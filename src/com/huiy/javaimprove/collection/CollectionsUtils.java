package com.huiy.javaimprove.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/** 
 * ���Ϲ�����
 * threshold:��ֵ 
 * @author : yuanhui 
 * @date   : 2018��3��6��
 * @version 1.0
 */
public class CollectionsUtils {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("c");
		list.add(0,"d");		
		iteratorList(list);
//		Collections.sort(list);
//		Arrays.sort(list.toArray());
//		iteratorList(list);
//		List<String> linkedList = new LinkedList<String>();
	}
	
	public static <T> void  iteratorList(List<T> list){
		ListIterator listIterator = list.listIterator();
//		Iterator<T> iterator = list.iterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
	}
	
}
