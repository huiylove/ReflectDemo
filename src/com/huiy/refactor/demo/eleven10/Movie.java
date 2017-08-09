package com.huiy.refactor.demo.eleven10;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 * 电影
 *
 */
public class Movie {
	public static final int CHILDRENS = 2;//儿童片
	public static final int REGULAR = 0;//普通片
	public static final int NEW_RELEASE = 1;//新片
	
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
		 
		switch(arg){
			case REGULAR : 
				price = new RegularPrice();
			break;
			case CHILDRENS : 
				price = new ChildrenPrice();
			case NEW_RELEASE : 
				price = new NewReleasePrice();
			default:throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	/**
	 * 可变参数result作为临时变量,each不变则作为参数传递
	 * 最好不要在另一个对象的属性基础上运用switch语句，如果不得不使用，也应该是在对象自己的数据上
	 * @param each
	 * @param daysRented 租借时间
	 * @return
	 */
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented){
		return price.getFrequentRenterPoints(daysRented);
	}
	
	

}
