package com.huiy.refactor.demo.eleven10;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月8日
 * @version 1.0
 * Form Template Method
 *
 */
public abstract class Statement {
	public String print(Customer acustomer){
		String result = headString(acustomer);
		for(Rental each:acustomer.getRentals()){
			//费用
			//积分
			result+=eachRentalString(each);
		}
		result += footerString(acustomer);
		return result;
	}
	
	 abstract String headString(Customer acustomer);
	 abstract String eachRentalString(Rental each);
	 abstract String footerString(Customer acustomer);
}
