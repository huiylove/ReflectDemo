
package com.huiy.designpattern.abstractfactory.demo;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��16��
 * @version 1.0
 */
public class ToyotaCarFactory extends CarFactory {

	@Override
	public SportsCar createSportsCar() {
		return null;
	}

//	@Override
//	public Car createCar(int type) {
//		switch(type){
//			case 1: return new ToyotaSportsCar();
//			case 2: return new ToyotaSuvCar();
//		}
//		return null;
//	}


}
