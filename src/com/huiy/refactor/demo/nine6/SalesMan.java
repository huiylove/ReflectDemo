package com.huiy.refactor.demo.nine6;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��6��
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
