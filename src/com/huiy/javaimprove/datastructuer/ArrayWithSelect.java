package com.huiy.javaimprove.datastructuer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月5日
 * @version 1.0
 * 各种查找算法
 * 
 */
public class ArrayWithSelect {
	
	public static void main(String[] args){
		int [] array = {5,4,2,7,8,6};

	}
	
	/**
	 * 顺序查找
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
	 * 二分查找
	 * 保证元素有序
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
	 * 基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率
	 * 保证元素有序
	 * mid = low+(key-a[low])/a[high]-a[low]*(high-low)
	 * 适用于元素很多，相对分布均匀的数组
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
