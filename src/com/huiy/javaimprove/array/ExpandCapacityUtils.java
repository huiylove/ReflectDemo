package com.huiy.javaimprove.array;

import java.util.Arrays;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 *
 *
 */
public class ExpandCapacityUtils {
	   /**
	 * ������������ݴ���
	 * @param datas
	 * @param newLen �����ĳ���
	 * @return
	 */
	public static <T> T[] expandCapacity(T[] datas,int newLen){
	      newLen = newLen <0 ? datas.length:datas.length+newLen;
	      return Arrays.copyOf(datas, newLen);//ǳ����
    }
	
	/**
	 * ������������ݴ���1.5�� 
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
