package com.huiy.designpattern.ChainOfResponsibility;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��5��
 * @version 1.0
 *
 *
 */
public class ConcreteHandler extends Handler {
	
	private String name;
	
	ConcreteHandler(String name){
		this.name = name;
	}

	@Override
	public void handleRequest() {
		/** 
         * �ж��Ƿ��к�̵����ζ��� 
         * ����У���ת���������̵����ζ��� 
         * ���û�У��������� 
         */  
        if(getSuccessor() != null)  
        {              
            System.out.println("�Ź�����");
            System.out.println("--------"+this.name);
            getSuccessor().handleRequest();  //������������Ĵ���
        }else  
        {              
            System.out.println("----"+this.name);
            System.out.println("��������");  
        }  

	}
	
	

}
