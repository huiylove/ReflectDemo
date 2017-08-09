package com.huiy.refactor.demo.nine7;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public class Customer {
	String name;
	BillingPlan plan;
	PaymentHistory history;
	
	public boolean isNull(){
		return false;
	}
	
	static Customer newNull(){
		return new NullCustomer();
	}
	
	public BillingPlan getPlan(){
		return plan;
	}
	
	public void setPlan(BillingPlan plan) {
		this.plan = plan;
	}

	public String getCustomerName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PaymentHistory getHistory() {
		return history;
	}

	
}
