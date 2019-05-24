package com.huiy.javaimprove.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/** 
 * ���Ϲ�����
 * threshold:��ֵ 
 * @author : yuanhui 
 * @date   : 2018��3��6��
 * @version 1.0
 */
public class CollectionsUtils {

	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[]{3,5,8,7,4};
		Arrays.sort(intArray);
		Arrays.sort(intArray,new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("c");
		list.add(0,"d");		
//		iteratorList(list);
		Collections.sort(list);
//		Arrays.sort(list.toArray());
//		iteratorList(list);
//		List<String> linkedList = new LinkedList<String>();
		Set<String> s = new TreeSet<String>((o1,o2)->{
			return o1.compareTo(o2);
		});
	}
	
	public static <T> void  iteratorList(List<T> list){
		ListIterator listIterator = list.listIterator();
//		Iterator<T> iterator = list.iterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
	}
	
}
