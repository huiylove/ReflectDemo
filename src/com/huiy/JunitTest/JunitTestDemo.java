package com.huiy.JunitTest;

import org.junit.Test;

import com.huiy.refactor.demo.Customer;
import com.huiy.refactor.demo.Movie;
import com.huiy.refactor.demo.MovieOld;
import com.huiy.refactor.demo.Rental;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class JunitTestDemo {
	 
	@Test
    public void testJunit() {  
		Customer custom = new Customer("Ԭ��");
		Movie movie = new Movie("�����μ���",MovieOld.NEW_RELEASE);
		Rental rental = new Rental(movie,5);
		custom.addRental(rental);
		System.out.println(custom.statement());
    }  
}
