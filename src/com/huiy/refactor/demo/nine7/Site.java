package com.huiy.refactor.demo.nine7;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public class Site {
	Customer _customer;
	
	public Site(Customer customer){
		_customer = customer;
	}
	
	Customer getCustomer(){
		return (_customer==null)?Customer.newNull():_customer;
	}
	
	public static void main(String[] args){
		Site site = new Site(null);
		Customer customer = site.getCustomer();
		BillingPlan plan ;
//		if(customer==null) plan = BillingPlan.basic();
//		else plan = customer.getPlan();
//		String customerName;
//		if(customer==null) customerName = "occupant";
//		else customerName = customer.getCustomerName();
		if(customer.isNull()) plan = BillingPlan.basic();
		else plan = customer.getPlan();
		String customerName = customer.getCustomerName();
		
	}
}
