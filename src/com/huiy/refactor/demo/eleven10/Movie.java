package com.huiy.refactor.demo.eleven10;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 * ��Ӱ
 *
 */
public class Movie {
	public static final int CHILDRENS = 2;//��ͯƬ
	public static final int REGULAR = 0;//��ͨƬ
	public static final int NEW_RELEASE = 1;//��Ƭ
	
	private String title;

	private Price price;
	
	
	public Movie(String title,int priceCode){
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		 
		switch(arg){
			case REGULAR : 
				price = new RegularPrice();
			break;
			case CHILDRENS : 
				price = new ChildrenPrice();
			case NEW_RELEASE : 
				price = new NewReleasePrice();
			default:throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	/**
	 * �ɱ����result��Ϊ��ʱ����,each��������Ϊ��������
	 * ��ò�Ҫ����һ����������Ի���������switch��䣬������ò�ʹ�ã�ҲӦ�����ڶ����Լ���������
	 * @param each
	 * @param daysRented ���ʱ��
	 * @return
	 */
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented){
		return price.getFrequentRenterPoints(daysRented);
	}
	
	

}
