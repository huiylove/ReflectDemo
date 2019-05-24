package com.huiy.javaimprove.enumdemo;

/**
 * @author huiylove
 * @date 2019年5月14日
 * 常量在一个变化范围内使用enum
 */
public enum DateEnum {
	    MONDAY(1), 
	    TUESDAY(2), 
	    WEDNESDAY(3), 
	    THURSDAY(4), 
	    FRIDAY(5),
		SATURDAY(6), 
		SUNDAY(7);
	    
	    private DateEnum(int data){
	    	this.data = data;
	    }
	    
	    private int data;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		 public static DateEnum getByValue(int value) {
	         for (DateEnum date : values()) {
	             if (date.getData() == value) {
	            	 return date;
	             }
	         }
	         return null;
		 }

	    
	    
}
