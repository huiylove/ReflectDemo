package com.huiy.refactor.demo.nine7;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��6��
 * @version 1.0
 *
 *
 */
public class NullCustomer extends Customer{
	
	@Override
	public boolean isNull(){
		return true;
	}
	
	@Override
	public String getCustomerName() {
		return "occupant";
	}
	
	@Override
	public void setPlan (BillingPlan arg){
		
	}
}
