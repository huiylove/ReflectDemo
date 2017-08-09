package com.huiy.JunitTest;

import org.junit.Test;

import com.huiy.refactor.demo.Customer;
import com.huiy.refactor.demo.Movie;
import com.huiy.refactor.demo.MovieOld;
import com.huiy.refactor.demo.Rental;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月12日
 * @version 1.0
 *
 *
 */
public class JunitTestDemo {
	 
	@Test
    public void testJunit() {  
		Customer custom = new Customer("袁慧");
		Movie movie = new Movie("风月俏佳人",MovieOld.NEW_RELEASE);
		Rental rental = new Rental(movie,5);
		custom.addRental(rental);
		System.out.println(custom.statement());
    }  
}
