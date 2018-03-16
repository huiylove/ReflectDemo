package com.huiy.refactor.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class Rental {
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie,int daysRented){
		this.movie =  movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	/**
	 * �ɱ����result��Ϊ��ʱ����,each��������Ϊ��������
	 * ��ò�Ҫ����һ����������Ի���������switch��䣬������ò�ʹ�ã�ҲӦ�����ڶ����Լ���������
	 * @param each
	 * @return
	 * @deprecated Use {@link com.huiy.refactor.demo.MovieOld#getCharge()} instead
	 */
	@Deprecated
	public double getCharge() {
		return movie.getCharge(daysRented);
	}
	
	
	/**
	 * @deprecated Use {@link com.huiy.refactor.demo.MovieOld#getFrequentRenterPoints()} instead
	 */
	@Deprecated
	public int getFrequentRenterPoints(){
		return movie.getFrequentRenterPoints(daysRented);
	}
}
