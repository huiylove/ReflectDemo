package com.huiy.designpattern.abstractfactory.demo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��16��
 * @version 1.0
 */
public class NissanCarFactory extends CarFactory{

//	@Override
//	public Car createCar(int type) {
//		switch(type){
//			case 1: return new NissanSportsCar();
//			case 2: return new NissanSuvCar();
//		}
//		return null;
//	}

	@Override
	public SportsCar createSportsCar() {
		return null;
	}
}
