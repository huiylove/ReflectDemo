package com.huiy.refactor.demo.egiht13;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 * ��Ӱ
 *
 */
public class Movie {
	
//	private static final int CHILDRENS = 2;
//	private static final int REGULAR = 0;
//	private static final int NEW_RELEASE = 1;
	
	private String title;

	private Price price;
	
	
	public Movie(String title,Price price){
		this.title = title;
		this.price = price;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
    
	

}
