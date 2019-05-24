package com.huiy.javaimprove.Exception;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 *RuntimeException���Բ����������ߴ���
 *
 */

public class MyexceptionTest {
       public void display(int i) throws MyException{
    	    if(i==0){
    	    	throw new MyException("�׳��Ҷ�����쳣:��ֵ����Ϊ0,�ϼ�");
    	    }else{
    	    	System.out.println(i/2);
    	    }
       }
       
       public static void main(String[] args){
    	   MyexceptionTest test = new MyexceptionTest();
    	   try {
			   test.display(0);
		   } catch (MyException e) {
			   System.out.println(e.getMessage());
//   	       throw new MyException("�׳��Ҷ�����쳣:��ֵ����Ϊ0",e);
//			   e.printStackTrace();
		   }
       }
}
