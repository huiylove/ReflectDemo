package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public interface Price {
	 int getPriceCode();
	 double getCharge(int daysRented);
	 int getFrequentRenterPoints(int daysRented);
	 
	
}
