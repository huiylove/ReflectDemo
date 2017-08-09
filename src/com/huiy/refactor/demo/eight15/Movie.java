package com.huiy.refactor.demo.eight15;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 * ��Ӱ
 *
 */
public class Movie {
	
	private String title;
	private Price price;
	
	public Movie(String title,int priceCode){
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		price = Price.newPrice(arg);
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented){
		return price.getFrequentRenterPoints(daysRented);
	}

}
