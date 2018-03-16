package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��8��
 * @version 1.0
 *
 *
 */
public class TextStatement extends Statement{
	
	 @Override
	String headString(Customer acustomer){
		return  "Rental Record for "+acustomer.getName()+"\n";
	}
	 
	@Override
	String eachRentalString(Rental each){
		return "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
	}
	
	@Override
	String footerString(Customer acustomer){
		return "Amount owed is "+String.valueOf(acustomer.getTotalCharge())+"\n"+
				"You earned "+String.valueOf(acustomer.getTotalFrequentRenterPoints())+" frequent renter pointer";
	}
}
