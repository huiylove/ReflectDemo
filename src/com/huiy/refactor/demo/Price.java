package com.huiy.refactor.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 *
 */
public interface Price {
	 int getPriceCode();
	 double getCharge(int daysRented);
	 int getFrequentRenterPoints(int daysRented);
	 
	
}
