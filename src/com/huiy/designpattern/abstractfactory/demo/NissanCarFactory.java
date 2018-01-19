package com.huiy.designpattern.abstractfactory.demo;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月16日
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
