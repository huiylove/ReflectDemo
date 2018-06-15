package com.huiy.javaimprove.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 * asList返回的是一个长度不可变的列表。
 * 数组是多长，转换成的列表是多长，我们是无法通过add、remove来增加或者减少其长度的
 *
 */
public class ArrayToList {
	public static void main(String[] args) {  
//        int[] datas = new int[]{1,2,3,4,5};  
		Integer[] datas = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(datas);  
        //list.add(8); --此句会抛异常，无法通过转换成list来增加数组的长度
        System.out.println(list.size());  
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));  

        }
        list.toArray();
    }  
}
