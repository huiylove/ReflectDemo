package com.huiy.javaimprove.datastructuer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��5��
 * @version 1.0
 * ���������㷨
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
	
	 //һ�ι鲢
    /**
     *         ���������������й鲢��һ���������еĹ���
     * @param r        ԭ���飬��Ҫ�鲢������
     * @param r1    �����飬�鲢�������
     * @param s        �����������еĵ�һ���������еĵ�һ��Ԫ�ص��±�
     * @param m        �����������еĵ�һ���������е����һ��Ԫ�ص��±�
     * @param t        �����������еĵڶ����������е����һ��Ԫ�ص��±�
     */
    public static void merge(int[] r, int[] r1, int s, int m, int t){
        int i = s;    //�����������еĵ�һ���������еĵ�һ��Ԫ�ص��±�
        int j = m+1;    //�����������еĵڶ����������еĵ�һ��Ԫ�ص��±�
        int k = s;        //�������е�ָ��
        while(i <= m && j <= t){//�����������ж�û�б�����
            if(r[i] < r[j]){
                r1[k++] = r[i++];
            }else{
                r1[k++] = r[j++];
            }
        }
        //������һ�����б�����֮�󣬽�ʣ���Ǹ����мӵ���������,�ж�����һ������û�б�����
        while(i <= m){
            r1[k++] = r[i++];
        }
        while(j<=t){
            r1[k++] = r[j++];
        }
    }
	
	/**
     * һ�˹鲢����
     * @param r    ԭ���飬��Ҫ�鲢����������
     * @param r1 �����飬�鲢�õ�����
     * @param h ��������(���������к��е�Ԫ�ظ���)
     * @param n    ���鳤��(�����±�����ֵ)
     */
    public static void mergePass(int[] r, int[] r1, int h, int n){
        //�жϸ��ݲ����ֳܷɶ���������У�
        int i = 0;
        while((i+2*h-1) <= n){//���鲢�����������������еĳ��Ⱦ�Ϊh,��Ҫ���(i+2*h-1)����˼��
            merge(r,r1,i,i+h-1,i+2*h-1);//��Ҫע��һ�ι鲢��Ҫ�Ĳ���
            i += 2*h;            
        }
        if(i+h-1 < n){//˵��������������У���һ�����г���Ϊh���ڶ������г���С��h
            merge(r,r1,i,i+h-1,n);
            i += 2*h;
        }else{//ʣ�����һ�����У����Ȳ���С�ڻ����h,���ù鲢�ˣ�ֱ�ӷ�����������
            for(; i<=n; i++){
                r1[i] = r[i];
            }
        }
    }
    
	
  //���ֹ鲢����ǵݹ��㷨
    //n����������±�
    public static void mergeSort(int[] r, int[] r1,int n){
        int h = 1;    //��1��ʼ����
        while(h<n){    //ֱ��h>=n�Ž�����Ҳ�Ͳ���С��nʱ��Ҫ���й鲢
            mergePass(r,r1,h,n);    //һ�˹鲢
            h = 2*h;
            mergePass(r1,r,h,n);//��Ϊ����һ�˹鲢��r1�ͱ�Ϊ���Ǹ���Ҫ�鲢�����飬��ôr�ͳ䵱�����飬������Ҳ�ܹ�������õ�����Żص�r������
            h = 2*h;            
        }
    }
	
	
	 /**
	 * һ�αȽϺ��ȡ��ֵ��λ��
	 * @param array ����
	 * @param first ָ�������������е�������еĵ�һ��λ��
	 * @param end   ָ�������������е��Ҳ����е����һ��λ��
	 * ��ֵΪ����ĵ�һ��Ԫ��
	 * @return
	 */
	public static int Partition(int[] array, int first, int end){
		 int i = first;
		 int j = end;
		 while(i<j){
			 while(i<j&&array[i]<array[j]){
				 j--;
			 }
			 if(i<j){//array[i]>array[j] ��ֵ��λ�ñ�Ϊ��j
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
				 i++;
			 }
			 while(i<j&&array[i]<array[j]){
				 i++;
			 }
			 if(i<j){//array[i]>array[j] ��ֵ��λ�ñ�Ϊ��i
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
            int pivot = Partition(array,first,end);    //������ֵ��λ�ã�
            quickSort(array,first,pivot-1);//��һ���źú�pivot-1���������β����λ��
            quickSort(array,pivot+1,end);    //pivot+1���Ҳ��ʼ��λ�á�
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
      	* �����󶥶ѵĲ�����
      	* ���ڵ���������ӽڵ�Ĵ�С�ȽϺͻ�����ÿ�ν�������λ�ú����鴫������
      	* ���ܹ������󶥶��ˡ�
	   	* @param array  ��������
	 	* @param s    ��ǰ��ָ���ڵ���������λ��(�±�)
	   	* @param length ����ĳ��ȡ������жϸ��ڵ�������ӽڵ��Ƿ���ڡ�
	   	* ���ڵ�����ӽ��Ĺ�ϵ�� 2s+1
	   	* ���������ӽ��Ĺ�ϵ�� 2s+2
	   	*/
        private static void adjustMaxHeap(int[] array, int s, int length) {
             int temp = array[s];
             int child;            //�������һ�����ӽڵ�������±�
             //2s+1 �����ӽڵ��������е�λ�ã�����s+1�Ǹ��ڵ��ڶ������е�λ�ã�2*(s+1) �����ӽڵ��ڶ������е�λ�ã���ô���ӽڵ��������е�λ��Ϊ2*(s+1)-1���򻯾�Ϊ2s+1��
             //Ϊʲô��Ҫ���forѭ�����ܶ��˲���⣬�������������ֻ��Ҫ�ҵ����ڵ�������ӽ������һ�����ɣ�������Ϊ������һ��С���⣬�����浽152�еĽ���Ӧ�þ������ˡ�
             for(child=s*2+1; child <= length-1; child=child*2+1){    //child <= length-1 ˵���϶����ӽڵ㣬���child=length-1��˵��ֻ������
                 if(child < length-1&&array[child] < array[child+1]){//child<length-1����˵���϶����ӽ�㣬������бȽϣ��ҳ����һ���������±�
                     child++;    //������ӽڵ����������е��±꣬�ҵ��Ǹ��ϴ���ӽڵ�
                 }
                 if(array[child] > temp){    //���ӽڵ�(���������㣬Ҳ�������ҽ�㣬�Ϳ���������ж���)�븸�ڵ���бȽϣ��ӽڵ��Ļ�������ĸ������ڵ�
                   array[s] = array[child];    
                  }else{        //���ڵ��ʲôҲ�������������ѭ����
                     break;
                 }
                 array[child] = temp;    //������Ϊ���ʱ��Ҫ��ԭ�ȵĸ��ڵ��ֵ�����ڵ��ӽڵ㡣
                 s = child;        //��Ϊ�ӽڵ��ֵ���ˣ���ô�Ͳ�֪������ӽڵ������Լ��������ӽڵ����Ƿ������������Ҫ�����ӽڵ�������±��s��ȥ���¼��һ�顣ֻ�е����ڵ�Ϊ���ʱ���Ż�ִ��break�˳�ѭ����
            }
      }
    
       /*
       * Ҫ֪��ʲô�Ƕ��������ݽṹ
       *         ����һ����ȫ����������Ϊ�󶥶Ѻ�С���ѣ�
       *         �󶥶ѣ�ÿ������㶼���Լ����ӽڵ��Ҳ���Ǹ����Ϊ���
       *         С���ѣ�ÿ������㶼���Լ����ӽڵ�С��Ҳ���Ǹ������С��
       * ���մ󶥶Ѻ�С���������ص㣬��һ�������n����¼�����й����ɴ󶥶�,�����ڵ��ϵ��������һ��
       * ���n���н�����Ȼ���ڶ�n-1����¼���й����󶥶ѣ������Ѹ��ڵ������һ�����(n-1)��������������Ĳ�����
       *         ��С����������ʹ�ô󶥶�
       *         �Ӵ�С������ʹ��С����
       *     ��С����
       */
       public static void heapSort(int[] array){
            //��һ���������鹹����һ���󶥶� 
	   		int length = array.length;    //lengthΪ����ĳ��ȣ��м��������Ǽ�����Ҫ�����������±�ֵ������ˣ���10������length����10����������±�Ϊ9
	   		//�ҵ���ȫ�������е����һ�������(ӵ���ӽ��)��λ��length/2��Ҳ�������һ�����ڵ�������ȫ�������ĵ�length/2��λ���ϣ������������е�λ���� (length/2)-1���������ڵ��������е�λ��
            for(int i = length/2-1; i >= 0; i--){//���α���ÿһ�����ڵ㣬�������һ�����ڵ���4����ô��ǰ�����н�㶼�Ǹ��ڵ㣬����Ҫ���й���
                adjustMaxHeap(array,i,length);    //�������У�������Ҫ��������ȫ�����й������÷�������������ǣ��Ƚ��ҵ����ڵ㣬�������ӽڵ������������õ����ڵ��λ���ϡ�
            }
            //�ڶ������������˴󶥶Ѻ󣬽���һ���������һ�����л���,��������������󶥶ѣ�
            for(int i = length-1; i > 0; i--){
               wrap(array, 0, i);        //�������ݣ���ȡ�����ˡ��������ݺ󣬾��Ѿ������Ǵ󶥶��ˣ���Ҫ���½��й���
               adjustMaxHeap(array, 0, i);    //�������£���Ϊ�����϶��Ѿ������ˣ�û��Ҫ�ڴ����������½��й������ˣ����������ǰ��ȽϵĽ���������˺ܶ�αȽϡ�
            }
        }
          
       
       
	  //��������
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
