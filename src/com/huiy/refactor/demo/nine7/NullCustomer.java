package com.huiy.refactor.demo.nine7;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public class NullCustomer extends Customer{
	
	public boolean isNull(){
		return true;
	}
	
	public String getCustomerName() {
		return "occupant";
	}
	
	public void setPlan (BillingPlan arg){
		
	}
}
