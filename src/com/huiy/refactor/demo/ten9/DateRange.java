package com.huiy.refactor.demo.ten9;

import java.util.Date;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��7��
 * @version 1.0
 *
 *
 */
public class DateRange {
	private final Date _start;
	private final Date _end;
	
	public DateRange(Date start,Date end){
		this._start = start;
		this._end = end;
	}

	public Date getStart() {
		return _start;
	}

	public Date getEnd() {
		return _end;
	}
	
	boolean includes(Date arg){
		return arg.equals(_start)||arg.equals(_end)||
		   (arg.after(_start)&&arg.before(_end));
	}
	
}
