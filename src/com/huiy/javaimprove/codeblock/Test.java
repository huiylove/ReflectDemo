package com.huiy.javaimprove.codeblock;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public class Test {
	
	 /** 
     * ��̬�����-����������ļ��ض���ִ�У�ֻҪ�౻�����˾ͻ�ִ��
     *            ����ֻ�����һ�Σ���Ҫ���ڸ�����г�ʼ��
     */  
    static {  
        System.out.println("ִ�о�̬�����...");  
    }  
	
	 /** 
     * ������� -ÿ����һ������ʱ�ͻ�ִ��һ�Σ��������ڹ��캯������Ҫ���ڳ�ʼ����ͬ�����Ե����ݺͳ�ʼ��ʵ������
     */  
    {  
        System.out.println("ִ�й�������...");  
    }  
      
    /** 
     * �޲ι��캯�� -ÿ����һ������ʱ�ͻ�ִ��һ��
     * ͬʱ���캯���Ǹ��ض�������г�ʼ��������������Ǹ����ж�����г�ʼ������������ͬ
     */  
    public Test(){  
        System.out.println("ִ���޲ι��캯��...");  
    }  
      
    /** 
     * �вι��캯�� 
     * @param id  id 
     */  
    public Test(String id){  
        System.out.println("ִ���вι��캯��...");  
    }  
    
    
    public static void main(String[] args) {  
    	    try {
    	        //�౻����֮��jvm�Ѿ������һ��������ṹ��Classʵ��
    	    	//���ǻ���Ҫ�������ʼ������֮���������ʹ�ô��࣬���ʼ����������ִ��һ����ľ�̬��䣬������̬�������������о�̬����顣
				Class.forName("com.huiy.javaimprove.codeblock.Test");//�����࣬���ҳ�ʼ����
	            System.out.println("----------------");  
//				new Test();  
//	            System.out.println("----------------");  
//	            new Test("1");  
			} catch (Exception e) {
				e.printStackTrace();
			}
            
    }  
}
