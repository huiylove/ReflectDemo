package com.huiy.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,String> map =  new HashMap<Character,String>();
		map.put('a',"a");
		map.put('b',"b");
		map.put('c',"c");
		map.put('a',"a");
		map.put('b',"b");
		Set<Entry<Character,String>> keySets = map.entrySet();
		for(Entry<Character,String> entry:keySets){
			System.out.println(entry);
			
		}
        
	}

}
