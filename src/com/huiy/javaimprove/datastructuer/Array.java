package com.huiy.javaimprove.datastructuer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月5日
 * @version 1.0
 * 各种排序算法
 * 
 */
public class Array {
	
	public static void main(String[] args){
		int [] array = {5,4,2,7,8,6};
//		Array.selectSort(array);
//		Array.insertSort(array);
//		int [] array1 = new int[array.length];
//		Array.mergeSort(array,array1,array.length-1);
//		Array.quickSort(array,0,array.length-1);
//		Array.shellSort(array);
		Array.heapSort(array);
		Array.iterator(array);

	}
	
	public static void selectSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int t = array[j];
					array[j] = array[i];
					array[i] = t;
				}
			}
		}
		
	}
	
	public static void insertSort(int[] array){
		int j,ctemp ;
		for(int i=1;i<array.length;i++){
			if(array[i-1]>array[i]){
				ctemp = array[i];
				for(j=i-1;j>=0&&ctemp<array[j];j--){
					array[j+1] = array[j];
				}
				array[j+1] = ctemp;//j+1
			}
		}
	}
	
	public static void bubbleSort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int t = array[j+1];
					array[j+1] = array[j];
					array[j] = t;
				}
			}
		}
	}
	
	 //一次归并
    /**
     *         相邻两个有序序列归并成一个有序序列的过程
     * @param r        原数组，需要归并的数组
     * @param r1    新数组，归并后的数组
     * @param s        两个有序序列的第一个有序序列的第一个元素的下标
     * @param m        两个有序序列的第一个有序序列的最后一个元素的下标
     * @param t        两个有序序列的第二个有序序列的最后一个元素的下标
     */
    public static void merge(int[] r, int[] r1, int s, int m, int t){
        int i = s;    //两个有序序列的第一个有序序列的第一个元素的下标
        int j = m+1;    //两个有序序列的第二个有序序列的第一个元素的下标
        int k = s;        //新数组中的指向
        while(i <= m && j <= t){//两个有序序列都没有遍历完
            if(r[i] < r[j]){
                r1[k++] = r[i++];
            }else{
                r1[k++] = r[j++];
            }
        }
        //当其中一个序列遍历完之后，将剩下那个序列加到新数组中,判断是哪一个序列没有遍历完
        while(i <= m){
            r1[k++] = r[i++];
        }
        while(j<=t){
            r1[k++] = r[j++];
        }
    }
	
	/**
     * 一趟归并排序
     * @param r    原数组，需要归并操作的数组
     * @param r1 新数组，归并好的数组
     * @param h 步长多少(有序序列中含有的元素个数)
     * @param n    数组长度(数组下标的最大值)
     */
    public static void mergePass(int[] r, int[] r1, int h, int n){
        //判断根据步长能分成多个有序序列，
        int i = 0;
        while((i+2*h-1) <= n){//待归并的两个相邻有序序列的长度均为h,需要理解(i+2*h-1)的意思。
            merge(r,r1,i,i+h-1,i+2*h-1);//需要注意一次归并需要的参数
            i += 2*h;            
        }
        if(i+h-1 < n){//说明最后还有两个序列，第一个序列长度为h，第二个序列长度小于h
            merge(r,r1,i,i+h-1,n);
            i += 2*h;
        }else{//剩下最后一个序列，长度并且小于或等于h,不用归并了，直接放入新数组中
            for(; i<=n; i++){
                r1[i] = r[i];
            }
        }
    }
    
	
  //二分归并排序非递归算法
    //n：数组最大下标
    public static void mergeSort(int[] r, int[] r1,int n){
        int h = 1;    //从1开始排序
        while(h<n){    //直到h>=n才结束，也就步长小于n时都要进行归并
            mergePass(r,r1,h,n);    //一趟归并
            h = 2*h;
            mergePass(r1,r,h,n);//因为经过一趟归并后，r1就变为了那个需要归并的数组，那么r就充当新数组，并且这也能够让排序好的数组放回到r数组中
            h = 2*h;            
        }
    }
	
	
	 /**
	 * 一次比较后获取轴值的位置
	 * @param array 数组
	 * @param first 指向两个排序序列的左侧序列的第一个位置
	 * @param end   指向两个排序序列的右侧序列的最后一个位置
	 * 轴值为数组的第一个元素
	 * @return
	 */
	public static int Partition(int[] array, int first, int end){
		 int i = first;
		 int j = end;
		 while(i<j){
			 while(i<j&&array[i]<array[j]){
				 j--;
			 }
			 if(i<j){//array[i]>array[j] 轴值的位置变为了j
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
				 i++;
			 }
			 while(i<j&&array[i]<array[j]){
				 i++;
			 }
			 if(i<j){//array[i]>array[j] 轴值的位置变为了i
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
				 j--;
			 }
		 }
		 return j;
	 }
	
	
	
    public static void quickSort(int[] array, int first, int end){
        if(first < end){
            int pivot = Partition(array,first,end);    //返回轴值的位置，
            quickSort(array,first,pivot-1);//第一次排好后，pivot-1就是左侧最尾部的位置
            quickSort(array,pivot+1,end);    //pivot+1，右侧最开始的位置。
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
    
    
   
    	/**
      	* 构建大顶堆的操作，
      	* 父节点和其左右子节点的大小比较和互换，每次将父结点的位置和数组传进来，
      	* 就能构建出大顶堆了。
	   	* @param array  排序数组
	 	* @param s    当前所指父节点在数组中位置(下标)
	   	* @param length 数组的长度。用来判断父节点的两个子节点是否存在。
	   	* 父节点和左子结点的关系： 2s+1
	   	* 父结点和右子结点的关系： 2s+2
	   	*/
        private static void adjustMaxHeap(int[] array, int s, int length) {
             int temp = array[s];
             int child;            //代表更大一方的子节点的数组下标
             //2s+1 是左子节点在数组中的位置，本来s+1是父节点在二叉树中的位置，2*(s+1) 是左子节点在二叉树中的位置，那么左子节点在数组中的位置为2*(s+1)-1，简化就为2s+1了
             //为什么需要这个for循环？很多人不理解，觉得这个方法里只需要找到父节点和两个子结点最大的一个即可，这是因为忽略了一个小问题，看下面到152行的解释应该就明白了。
             for(child=s*2+1; child <= length-1; child=child*2+1){    //child <= length-1 说明肯定有子节点，如果child=length-1，说明只有左结点
                 if(child < length-1&&array[child] < array[child+1]){//child<length-1，就说明肯定右子结点，将其进行比较，找出大的一方的数组下标
                     child++;    //变成右子节点所在数组中的下标，找到那个较大的子节点
                 }
                 if(array[child] > temp){    //将子节点(可能是左结点，也可能是右结点，就看上面这个判断了)与父节点进行比较，子节点大的话，将大的赋给父节点
                   array[s] = array[child];    
                  }else{        //父节点大，什么也不做，跳出这层循环。
                     break;
                 }
                 array[child] = temp;    //父结点变为最大时，要将原先的父节点的值给现在的子节点。
                 s = child;        //因为子节点的值变了，那么就不知道这个子节点在他自己的两个子节点中是否还是最大，所以需要将该子节点的数组下标给s，去重新检测一遍。只有当父节点为最大时，才会执行break退出循环。
            }
      }
    
       /*
       * 要知道什么是堆这种数据结构
       *         堆是一颗完全二叉树。分为大顶堆和小顶堆，
       *         大顶堆，每个父结点都比自己的子节点大，也就是根结点为最大
       *         小顶堆，每个父结点都比自己的子节点小，也就是根结点最小。
       * 按照大顶堆和小顶堆这种特点，将一个无序的n个记录的序列构建成大顶堆,将根节点上的数与最后一个
       * 结点n进行交换，然后在对n-1个记录进行构建大顶堆，继续把根节点与最后一个结点(n-1)互换，继续上面的操作。
       *         从小到大排序，则使用大顶堆
       *         从大到小排序，则使用小顶堆
       *     从小到大
       */
       public static void heapSort(int[] array){
            //第一步：将数组构建成一个大顶堆 
	   		int length = array.length;    //length为数组的长度，有几个数就是几，不要跟数组最大的下标值搞混淆了，有10个数，length就是10，数组最大下标为9
	   		//找到完全二叉树中的最后一个父结点(拥有子结点)的位置length/2，也就是最后一个父节点是在完全二叉树的第length/2的位置上，但是在数组中的位置是 (length/2)-1，它代表父节点在数组中的位置
            for(int i = length/2-1; i >= 0; i--){//依次遍历每一个父节点，比如最后一个父节点是4，那么它前面所有结点都是父节点，都需要进行构建
                adjustMaxHeap(array,i,length);    //无序序列，所以需要从下往上全部进行构建。该方法做的事情就是，比较找到父节点，和两个子节点中最大的数放置到父节点的位置上。
            }
            //第二步：构建好了大顶堆后，将第一个数与最后一个进行互换,互换后继续调整大顶堆，
            for(int i = length-1; i > 0; i--){
               wrap(array, 0, i);        //互换数据，提取出来了。互换数据后，就已经不在是大顶堆了，需要重新进行构建
               adjustMaxHeap(array, 0, i);    //从上往下，因为基本上都已经有序了，没必要在从下往上重新进行构建堆了，这就利用了前面比较的结果，减少了很多次比较。
            }
        }
          
       
       
	  //互换数据
	    private static void wrap(int[] array, int i, int j){
	             int temp = array[i];
	             array[i] = array[j];
	             array[j] = temp;
	    }
    
    
	public static void iterator(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
	
	
	
	

}
