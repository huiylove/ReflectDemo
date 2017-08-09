package com.huiy.refactor.demo.nine6;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��6��
 * @version 1.0
 *
 *
 */
public class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}

	@Override
	int payAmount(Employee ee) {
		return ee.getMonthlySalary();
	}

}
