package com.huiy.designpattern.chainexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Test {

	public static void main(String[] args) {
		//先要组装责任链  
        Handler h1 = new TaxHandler();  
        Handler h2 = new FundHandler();  
        Handler h3 = new InsuranceHandler();  
        h3.setSuccessor(h2);  
        h2.setSuccessor(h1);  
        //月薪1万
        double salary1 = h3.handleRequest(10000,0);
        System.out.println("月薪1万的税后工资："+salary1);
        //月薪5万
        double salary2 = h3.handleRequest(50000,0);
        System.out.println("月薪5万的税后工资："+salary2);
        //月薪10万
        double salary3 = h3.handleRequest(100000,0);
        System.out.println("月薪10万的税后工资："+salary3);
        //月薪20万
        double salary4 = h3.handleRequest(200000,0);
        System.out.println("月薪20万的税后工资："+salary4);
	}

}
