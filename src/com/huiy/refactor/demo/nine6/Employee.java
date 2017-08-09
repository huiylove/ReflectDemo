package com.huiy.refactor.demo.nine6;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *
 *
 */
public class Employee {
	  private  int _monthlySalary ;
	  private  int _commission;
	  private  int _bonus;
	  
	  private String name;
	  private EmployeeType _type;
	  
//	  private int _type;
//	  
	  Employee(int type){
		  setType(type);
	  }
	  
	  Employee(EmployeeType type){
		  _type = type;
	  }
	  

	public void setType(int type) {
		_type = EmployeeType.create(type);
	}

	public int getType() {
		return _type.getTypeCode();
	  }

      int payAmount(){
       return _type.payAmount(this);
//		  switch(getType()){
//		  	case EmployeeType.ENGINEER : return _monthlySalary;
//		  	case EmployeeType.SALESMAN : return _monthlySalary+_commission;
//		  	case EmployeeType.MANAGER : return _monthlySalary+_bonus;
//		  	default : throw new RuntimeException("Incorrect Employee");
//		  }
    	  
    	  
	 }

	public int getMonthlySalary() {
		return _monthlySalary;
	}


	public int getCommission() {
		return _commission;
	}

	public int getBonus() {
		return _bonus;
	}


      
}
