package com.huiy.javaimprove.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��27��
 * @version 1.0
 *
 *
 */
public class ListTest {

	public static void main(String[] args) {
		//���������ȷ������Ԫ�صĶ��٣����ָ��һ����ʼ����ֵ���������Ľ������ݲ������˷�ʱ�䡢Ч��
		List alist = new ArrayList(10);
		Iterator it = alist.iterator();
		if(it.hasNext()){
			System.out.println(it.next());
		}
		
		Stack s = new Stack();
		s.push("1");
		s.push(2);
		s.push(true);
		while(!s.empty()){
			System.out.println(s.pop());
		}
		
	}

}
