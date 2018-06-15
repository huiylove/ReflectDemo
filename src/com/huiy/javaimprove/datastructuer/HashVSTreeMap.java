package com.huiy.javaimprove.datastructuer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;


/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月7日
 * @version : 1.0
 */
public class HashVSTreeMap {
	
	@Test
    public void testJunit() {  
		  List<String> list = new ArrayList<String>();
		  list.add("1");
		  list.add("2");
		  list.add("3");
		  int [] intArray  = new int[]{1,2,3};
		  List<int[]> intList =  Arrays.asList(intArray);
//		  List<Integer> ilist = Ints.asList(intArray);
		  System.out.println(Arrays.toString(intArray));
		  System.out.println(Arrays.toString(list.toArray()));
//		  TreeMap<String,Integer> tmap = new TreeMap<String,Integer>();
//		  tmap.put("1",2);
//		  tmap.put("2",null);
//		  tmap.put(null,5);
//		  tmap.get("1");
		  
		  TreeMap<String, Integer> ts = new TreeMap<String, Integer>(new Comparator<String>() {
			    //倒序排列
	            public int compare(String s1, String s2) {      
	            // 这里明确s1是要拿进来存的数据 s2是已经存进来的数据
	                if (s1 == null){
	                    return 1;
	                }
	                else {
	                    return s2.charAt(0) - s1.charAt(0);
	                }
	            }
	        });
		  
//	        ts.put("四", 1);
//	        ts.put("二", 2);
//	        ts.put(null, 3);
//	        ts.put("一", 3);
	        
	        ts.put("四", 1);
	        ts.put("五", 2);
	        
	        Set<Map.Entry<String, Integer>> s = ts.entrySet();
	        for (Map.Entry<String, Integer> entry : s) {
	            System.out.println(entry);
	        }
	        
	        Map<String,Integer> map = new HashMap<String,Integer>();
	        map.put("ddd",1);
	        
	        
    }  
}
