package com.huiy.refactor.demo.eleven10;

import java.util.Vector;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 */

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();
	private Statement statement;
	
	public Customer(String name){
		this.name = name;
	}
	
	public void addRental(Rental rental){
		rentals.addElement(rental);
	}
	
	public Vector<Rental> getRentals() {
		return rentals;
	}


	public String getName(){
		return name;
	}
	
	
//	public String statement(){
//		String result = "Rental Record for "+this.getName()+"\n";
//		for(Rental each:rentals){
//			//����
//			//����
//			result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
//		}
//		result += "Amount owed is "+String.valueOf(getTotalCharge())+"\n";
//		result += "You earned "+String.valueOf(getTotalFrequentRenterPoints())+" frequent renter pointer";
//		return result;
//	}
//	
//	public String htmlStatement(){
//		String result =  "<H1>Rental Record for <EM>"+this.getName()+"</EM></H1><P>\n";
//		for(Rental each:rentals){
//			//����
//			//����
//			result += each.getMovie().getTitle()+":"+String.valueOf(each.getCharge())+"<BR>\n";
//		}
//		result += "Amount owed is "+String.valueOf(getTotalCharge())+"\n";
//		result += "You earned "+String.valueOf(getTotalFrequentRenterPoints())+" frequent renter pointer";
//		return result;
//	}
	
	public String statement(){
		return statement.print(this);
	}
	
	
    double getTotalCharge(){
		double result = 0;
		for(Rental each:rentals){
			result += each.getCharge();
		}
		return result;
	}
	
	int getTotalFrequentRenterPoints(){
		int result = 0;
		for(Rental each:rentals){
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
}
