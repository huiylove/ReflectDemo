package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��8��
 * @version 1.0
 *
 *
 */
public class HtmlStatement extends Statement{
	String headString(Customer acustomer){
		return  "<H1>Rental Record for <EM>"+acustomer.getName()+"</EM></H1><P>\n";
	}
	 
	String eachRentalString(Rental each){
		return each.getMovie().getTitle()+":"+String.valueOf(each.getCharge())+"<BR>\n";
	}
	
	String footerString(Customer acustomer){
		return "Amount owed is "+String.valueOf(acustomer.getTotalCharge())+"\n"+
				"You earned "+String.valueOf(acustomer.getTotalFrequentRenterPoints())+" frequent renter pointer";
	}
}
