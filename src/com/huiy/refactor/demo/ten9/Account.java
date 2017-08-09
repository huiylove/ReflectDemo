package com.huiy.refactor.demo.ten9;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��7��
 * @version 1.0
 * Introduce Parameter Object 
 *
 */
public class Account {
	private Vector _entries = new Vector();
	
	double getFlowBetween(DateRange range){
		double result = 0;
		Enumeration e = _entries.elements();
		while(e.hasMoreElements()){
			Entry each = (Entry) e.nextElement();
//			if(each.getDate().equals(range.getStart())||each.getDate().equals(range.getEnd())||
//			   (each.getDate().after(range.getStart())&&each.getDate().before(range.getEnd()))){
//				result += each.getValue();
//			}
			if(range.includes(each.getDate())){
				result += each.getValue();
			}
		}
		return result;
	}
	
	public static void main(String args){
		Account acc = new Account();
		acc.getFlowBetween(new DateRange(null,null));
	}
}
