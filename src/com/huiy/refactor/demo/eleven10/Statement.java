package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��8��
 * @version 1.0
 * Form Template Method
 *
 */
public abstract class Statement {
	public String print(Customer acustomer){
		String result = headString(acustomer);
		for(Rental each:acustomer.getRentals()){
			//����
			//����
			result+=eachRentalString(each);
		}
		result += footerString(acustomer);
		return result;
	}
	
	 abstract String headString(Customer acustomer);
	 abstract String eachRentalString(Rental each);
	 abstract String footerString(Customer acustomer);
}
