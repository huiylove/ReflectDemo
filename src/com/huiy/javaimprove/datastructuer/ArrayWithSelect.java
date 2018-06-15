package com.huiy.javaimprove.datastructuer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��5��
 * @version 1.0
 * ���ֲ����㷨
 * 
 */
public class ArrayWithSelect {
	
	public static void main(String[] args){
		int [] array = {5,4,2,7,8,6};

	}
	
	/**
	 * ˳�����
	 * @param a
	 * @param value
	 * @param n
	 * @return
	 */
	int SequenceSearch(int a[], int value, int n)
	{
	    int i;
	    for(i=0; i<n; i++)
	        if(a[i]==value)
	            return i;
	    return -1;
	}
	
	/**
	 * ���ֲ���
	 * ��֤Ԫ������
	 * @param a
	 * @param value
	 * @param low
	 * @param high
	 * @return
	 */
	int BinarySearch(int a[], int value, int low,int high)
	{
		 int mid;
		 if(low<=high){
			 mid = low+(high-low)/2;
			 if(value==a[mid]){
					return mid;
				}
				if(value>a[mid]){
					BinarySearch(a,value,low,mid-1);
				}
				if(value>a[mid]){
					BinarySearch(a,value,mid+1,high);
				}
		}
		return -1;
	}
	
    
	/**
	 * 
	 * ���ڶ��ֲ����㷨�������ҵ��ѡ��Ľ�Ϊ����Ӧѡ�񣬿�����߲���Ч��
	 * ��֤Ԫ������
	 * mid = low+(key-a[low])/a[high]-a[low]*(high-low)
	 * ������Ԫ�غܶ࣬��Էֲ����ȵ�����
	 * @param a
	 * @param value
	 * @param low
	 * @param high
	 * @return
	 */
	int insertionSearch(int a[],int value,int low,int high){
		int mid = low+(value-a[low])/a[high]-a[low]*(high-low);
		if(value==a[mid]){
			return mid;
		}
		if(value>a[mid]){
			BinarySearch(a,value,mid+1,high);
		}
		if(value>a[mid]){
			BinarySearch(a,value,mid+1,high);
		}
		return -1;
		
	}
	

	
	
	public static void iterator(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
	
	
	
	

}
