package com.huiy.refactor.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��12��
 * @version 1.0
 *
 *
 */
public class DemoTest {

	public static void main(String[] args) {
		Customer custom = new Customer("Ԭ��");
		Movie movie = new Movie("�����μ���",Movie.REGULAR);
		Rental rental = new Rental(movie,5);
		custom.addRental(rental);
		System.out.println(custom.statement());
	}

}
