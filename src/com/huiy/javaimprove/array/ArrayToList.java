package com.huiy.javaimprove.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 * asList���ص���һ�����Ȳ��ɱ���б�
 * �����Ƕ೤��ת���ɵ��б��Ƕ೤���������޷�ͨ��add��remove�����ӻ��߼����䳤�ȵ�
 *
 */
public class ArrayToList {
	public static void main(String[] args) {  
//        int[] datas = new int[]{1,2,3,4,5};  
		Integer[] datas = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(datas);  
        //list.add(8); --�˾�����쳣���޷�ͨ��ת����list����������ĳ���
        System.out.println(list.size());  
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));  

        }
        list.toArray();
    }  
}
