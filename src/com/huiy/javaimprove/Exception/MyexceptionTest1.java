package com.huiy.javaimprove.Exception;


import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��23��
 * @version 1.0
 *RuntimeException���Բ����������ߴ���
 *
 */
public class MyexceptionTest1 {
	
	
	  
	
       public void display(int i) throws MyException{
	    	try {
				System.out.println(10/i);
			} catch (Exception e) {
				throw new MyException("�׳��Ҷ�����쳣:��ֵ����Ϊ0,�ϼ�",e);
			}
       }
       
       public static void main(String[] args){
    	   //���������ļ�
           PropertyConfigurator.configure("src/com/huiy/javaimprove/Exception/log4j.properties");
           //��ȡloger��¼��,����һ��ָ����ǰ���class
    	   Logger log = LoggerFactory.getLogger(MyexceptionTest1.class);
    	   MyexceptionTest1 test = new MyexceptionTest1();
    	   try {
			   test.display(0);
		   }catch (MyException e) {
			   System.out.println(e.getMessage());
//   	       throw new MyException("�׳��Ҷ�����쳣:��ֵ����Ϊ0",e);
//			   e.printStackTrace();
		   }catch (Exception e) {
		       log.error("������Ϣ�쳣",e);
//			   System.out.println(e.getMessage());
//   	       throw new MyException("�׳��Ҷ�����쳣:��ֵ����Ϊ0",e);
//			   e.printStackTrace();
		   }
       }
}
