package com.huiy.designpattern.chainexam;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		//��Ҫ��װ������  
        Handler h1 = new TaxHandler();  
        Handler h2 = new FundHandler();  
        Handler h3 = new InsuranceHandler();  
        h3.setSuccessor(h2);  
        h2.setSuccessor(h1);  
        //��н1��
        double salary1 = h3.handleRequest(10000,0);
        System.out.println("��н1���˰���ʣ�"+salary1);
        //��н5��
        double salary2 = h3.handleRequest(50000,0);
        System.out.println("��н5���˰���ʣ�"+salary2);
        //��н10��
        double salary3 = h3.handleRequest(100000,0);
        System.out.println("��н10���˰���ʣ�"+salary3);
        //��н20��
        double salary4 = h3.handleRequest(200000,0);
        System.out.println("��н20���˰���ʣ�"+salary4);
	}

}
