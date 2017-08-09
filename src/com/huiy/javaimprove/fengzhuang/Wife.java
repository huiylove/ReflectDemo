package com.huiy.javaimprove.fengzhuang;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class Wife {
	
	    private String name;  
	    private int age;  
	    private String sex;  
	    private Husband husband;  
	    public String sexName;
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public String getSex() {  
	        return sex;  
	    }  
	  
		public void setSex(String sex) {  
	        this.sex = sex;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
	  
	    public void setHusband(Husband husband) {  
	        this.husband = husband;  
	    }  
	  
	    public Husband getHusband() {  
	        return husband;  
	    }  
	    
	    public String getSexName() {  
	        if("0".equals(sex)){  
	            sexName = "女";  
	        }  
	        else if("1".equals(sex)){  
	            sexName = "男";  
	        }  
	        else{  
	            sexName = "人妖???";  
	        }  
	        return sexName;  
	    }  
	      
}
