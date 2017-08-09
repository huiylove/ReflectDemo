package com.huiy.refactor.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 * ��Ӱ
 *
 */
public class MovieOld {
	public static final int CHILDRENS = 2;//��ͯƬ
	public static final int REGULAR = 0;//��ͨƬ
	public static final int NEW_RELEASE = 1;//��Ƭ
	
	private String title;
	private int priceCode;
	
	
	public MovieOld(String title,int priceCode){
		this.title = title;
		this.priceCode = priceCode;
	}
	
	public String getTitle() {
		return title;
	}

	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	/**
	 * �ɱ����result��Ϊ��ʱ����,each��������Ϊ��������
	 * ��ò�Ҫ����һ����������Ի���������switch��䣬������ò�ʹ�ã�ҲӦ�����ڶ����Լ���������
	 * @param each
	 * @param daysRented ���ʱ��
	 * @return
	 */
	public double getCharge(int daysRented) {
		double result = 0;
		switch(getPriceCode()){
			case MovieOld.REGULAR:
				result+=2;
				if(daysRented>2)
					result += (daysRented-2)*1.5;
				break;
			case MovieOld.NEW_RELEASE:
				result += daysRented*3;
				break;
			case MovieOld.CHILDRENS:
				result +=1.5;
				if(daysRented>3)
					result += (daysRented-3)*1.5;
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int daysRented){
		if(getPriceCode()== MovieOld.NEW_RELEASE && daysRented>1)
			return 2;
		else
			return 1;
	}
	
	

}
