package com.huiy.refactor.demo.eight15;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if(daysRented>2)
			result += (daysRented-2)*1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
