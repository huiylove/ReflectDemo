package com.huiy.refactor.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 *
 */
public class DemoTest {

	public static void main(String[] args) {
		Customer custom = new Customer("袁慧");
		Movie movie = new Movie("风月俏佳人",Movie.REGULAR);
		Rental rental = new Rental(movie,5);
		custom.addRental(rental);
		System.out.println(custom.statement());
	}

}
