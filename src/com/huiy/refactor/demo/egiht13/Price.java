package com.huiy.refactor.demo.egiht13;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 *
 */
public class Price {
	private static final Price CHILDRENS = new Price(2);
	private static final Price REGULAR = new Price(0);
	private static final Price NEW_RELEASE = new Price(1);
	
	private static final Price[] prices = {REGULAR,NEW_RELEASE,CHILDRENS};

	private int _Code;
    
	private Price(int code){
		_Code = code;
	}
	 
	private int getCode() {
		return _Code;
	}

	public void setCode(int code) {
		_Code = code;
	}
	

	private static Price Code(int arg) {
		return prices[arg];
	}
	 
	
}
