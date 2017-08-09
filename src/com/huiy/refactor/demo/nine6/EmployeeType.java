package com.huiy.refactor.demo.nine6;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public abstract class EmployeeType {
	  static final int ENGINEER = 0;
	  static final int SALESMAN = 1;
	  static final int MANAGER = 2;
	  
	  static EmployeeType create(int type){
		  switch(type){
		  	case ENGINEER : return new Engineer();
		  	case SALESMAN : return new SalesMan();
		  	default : throw new RuntimeException("Incorrect Employee");
		  }
	  }
	  
	  abstract int getTypeCode();
	  
	  abstract int payAmount(Employee ee);
}
