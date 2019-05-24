package com.huiy.concurrency.thread.threadlocal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huiylove
 * @date 2019年4月10日
 */
public class SimpleDateFormatUtil {
	
	private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
	    @Override
	    protected DateFormat initialValue() {
	        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    }
	};
	
	public static Date parse(String dateStr) throws ParseException {
	    return threadLocal.get().parse(dateStr);
	}

	public static String format(Date date) {
	    return threadLocal.get().format(date);
	}
}
