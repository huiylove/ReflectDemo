package com.huiy.refactor.demo;

import java.util.Vector;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 */

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();
	
	public Customer(String name){
		this.name = name;
	}
	
	public void addRental(Rental rental){
		rentals.addElement(rental);
	}
	
	public String getName(){
		return name;
	}
	
	public String statement(){
		String result = "Rental Record for "+this.getName()+"\n";
		for(Rental each:rentals){
			//费用
			//积分
			result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
		}
		result += "Amount owed is "+String.valueOf(getTotalCharge())+"\n";
		result += "You earned "+String.valueOf(getTotalFrequentRenterPoints())+" frequent renter pointer";
		return result;
	}
	
	public String htmlStatement(){
		String result =  "<H1>Rental Record for <EM>"+this.getName()+"</EM></H1><P>\n";
		for(Rental each:rentals){
			//费用
			//积分
			result += each.getMovie().getTitle()+":"+String.valueOf(each.getCharge())+"<BR>\n";
		}
		result += "Amount owed is "+String.valueOf(getTotalCharge())+"\n";
		result += "You earned "+String.valueOf(getTotalFrequentRenterPoints())+" frequent renter pointer";
		return result;
	}
	
	private double getTotalCharge(){
		double result = 0;
		for(Rental each:rentals){
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		for(Rental each:rentals){
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
}
