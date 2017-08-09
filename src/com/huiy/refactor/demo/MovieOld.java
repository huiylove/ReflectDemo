package com.huiy.refactor.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 * 电影
 *
 */
public class MovieOld {
	public static final int CHILDRENS = 2;//儿童片
	public static final int REGULAR = 0;//普通片
	public static final int NEW_RELEASE = 1;//新片
	
	private String title;
	private int priceCode;
	
	
	public MovieOld(String title,int priceCode){
		this.title = title;
		this.priceCode = priceCode;
	}
	
	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	/**
	 * 可变参数result作为临时变量,each不变则作为参数传递
	 * 最好不要在另一个对象的属性基础上运用switch语句，如果不得不使用，也应该是在对象自己的数据上
	 * @param each
	 * @param daysRented 租借时间
	 * @return
	 */
	public double getCharge(int daysRented) {
		double result = 0;
		switch(getPriceCode()){
			case MovieOld.REGULAR:
				result+=2;
				if(daysRented>2)
					result += (daysRented-2)*1.5;
				break;
			case MovieOld.NEW_RELEASE:
				result += daysRented*3;
				break;
			case MovieOld.CHILDRENS:
				result +=1.5;
				if(daysRented>3)
					result += (daysRented-3)*1.5;
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int daysRented){
		if(getPriceCode()== MovieOld.NEW_RELEASE && daysRented>1)
			return 2;
		else
			return 1;
	}
	
	

}
