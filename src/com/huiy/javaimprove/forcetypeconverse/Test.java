package com.huiy.javaimprove.forcetypeconverse;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *�ڼ̳��У���������Զ�ת��Ϊ���࣬
 *���Ǹ���ǿ��ת��Ϊ����ʱֻ�е������������������Ϊ����ʱ�Ż�ǿ��ת���ɹ�������ʧ��
 *
 */
public class Test {
	public static void main(String[] args) {  
		Object[] objArr = new String[]{"a"};//new Object[]{"a","b","c"};
		String [] strArr = (String[]) objArr;
		System.out.println(strArr.getClass());
    }  
  
}
