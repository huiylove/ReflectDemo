package com.huiy.refactor.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
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
	 * 可变参数result作为临时变量,each不变则作为参数传递
	 * 最好不要在另一个对象的属性基础上运用switch语句，如果不得不使用，也应该是在对象自己的数据上
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
