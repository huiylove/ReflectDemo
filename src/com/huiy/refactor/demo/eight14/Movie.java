package com.huiy.refactor.demo.eight14;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public abstract class Movie {
	
	static final int CHILDRENS = 2;
	static final int REGULAR = 0;
	static final int NEW_RELEASE = 1;
	
//	private int _type;
	
	Movie(){}
	
//	Movie(int type){
//		_type = type;
//	}

	abstract int getType();

	static Movie create(int type){
		switch(type){
		  case CHILDRENS : return new ChildrensMovie();
		  case REGULAR : return new RegularMovie();
		  default:throw new IllegalArgumentException("Incorrect type code value");
		}
	}
	
	
}
