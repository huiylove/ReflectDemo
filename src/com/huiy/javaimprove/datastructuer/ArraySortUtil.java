package com.huiy.javaimprove.datastructuer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月29日
 * @version 1.0
 */
public class ArraySortUtil {
	
	public static void selectSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void insertSort(int[] array){
		int temp,j ;
		for(int i=1;i<array.length -1;i++){
			if(array[i]<array[i-1]){
				temp = array[i];
				for( j=i-1;j>=0&&array[j]>temp;j--){
					array[j+1] = array[j];
				}
				array[j+1] = temp;
			}
		}
	}
	
	
	public static void shellSort(int[] array){
    	int i,j,temp;
    	int length = array.length;
    	int gap = length;
    	do{
    		gap = length/2;
    		for(i=gap;i<length;i++){
    			if(array[i]<array[i-gap]){
        			temp = array[i];
                    for(j=i-gap;j>=0&&array[j]>temp;j=j-gap){
                    	array[j+gap] = array[j];
                    }
                    array[j+gap] = temp;
    			}
    		}
    	}while(gap>0);
    }
	

}
