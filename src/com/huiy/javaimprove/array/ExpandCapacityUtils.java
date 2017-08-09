package com.huiy.javaimprove.array;

import java.util.Arrays;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月23日
 * @version 1.0
 *
 *
 */
public class ExpandCapacityUtils {
	   /**
	 * 对数组进行扩容处理
	 * @param datas
	 * @param newLen 新增的长度
	 * @return
	 */
	public static <T> T[] expandCapacity(T[] datas,int newLen){
	      newLen = newLen <0 ? datas.length:datas.length+newLen;
	      return Arrays.copyOf(datas, newLen);//浅拷贝
    }
	
	/**
	 * 对数组进行扩容处理，1.5倍 
	 * @param datas
	 * @return
	 */
	public static <T> T[] expandCapacity(T[] datas){
		int newLen = (datas.length*3)/2;
		return Arrays.copyOf(datas, newLen);
	}
	
	public static <T> T[] expandCapacityMul(T[] datas,int mulit){
		int newLen = (mulit < 0?1:mulit)*datas.length;
		return Arrays.copyOf(datas, newLen);
	}
	
}
