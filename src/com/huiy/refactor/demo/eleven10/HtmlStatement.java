package com.huiy.refactor.demo.eleven10;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月8日
 * @version 1.0
 *
 *
 */
public class HtmlStatement extends Statement{
	@Override
	String headString(Customer acustomer){
		return  "<H1>Rental Record for <EM>"+acustomer.getName()+"</EM></H1><P>\n";
	}
	 
	@Override
	String eachRentalString(Rental each){
		return each.getMovie().getTitle()+":"+String.valueOf(each.getCharge())+"<BR>\n";
	}
	
	@Override
	String footerString(Customer acustomer){
		return "Amount owed is "+String.valueOf(acustomer.getTotalCharge())+"\n"+
				"You earned "+String.valueOf(acustomer.getTotalFrequentRenterPoints())+" frequent renter pointer";
	}
}
