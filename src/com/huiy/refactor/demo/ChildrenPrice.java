package com.huiy.refactor.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class ChildrenPrice implements Price {

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if(daysRented>3)
			result += (daysRented-3)*1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
