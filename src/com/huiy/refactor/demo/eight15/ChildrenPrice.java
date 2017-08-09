package com.huiy.refactor.demo.eight15;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class ChildrenPrice extends Price {

	@Override
	public int getPriceCode() {
		return CHILDRENS;
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
