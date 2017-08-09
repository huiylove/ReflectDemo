package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class NewReleasePrice implements Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented*3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented>1)?2:1;
	}
}
