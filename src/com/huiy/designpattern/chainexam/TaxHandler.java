package com.huiy.designpattern.chainexam;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
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
