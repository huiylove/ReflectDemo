package com.huiy.refactor.demo.eight15;



/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class NewReleasePrice extends Price {


	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
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
