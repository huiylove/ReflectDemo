package com.huiy.refactor.demo.eight15;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 * 电影
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
