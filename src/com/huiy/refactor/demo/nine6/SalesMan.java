package com.huiy.refactor.demo.nine6;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public class SalesMan extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}

	@Override
	int payAmount(Employee ee) {
		return ee.getMonthlySalary()+ee.getCommission();
	}

}
