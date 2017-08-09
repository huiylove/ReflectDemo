package com.huiy.designpattern.chainexam;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class TaxHandler extends Handler{

	@Override
	public double handleRequest(double pay,double payh) {
		double tax = (pay*0.5-payh)*0.1;
		double salary = pay-payh-tax;
    	return salary;
	}


}
