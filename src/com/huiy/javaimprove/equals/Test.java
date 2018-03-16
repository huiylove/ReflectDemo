package com.huiy.javaimprove.equals;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 * 在java中进行比较，我们需要根据比较的类型来选择合适的比较方式：
       1) 对象域，使用equals方法 。 
       2) 类型安全的枚举，使用equals或== 。
       3) 可能为null的对象域 : 使用 == 和 equals 。
       4) 数组域 : 使用 Arrays.equals 。
       5) 除float和double外的原始数据类型 : 使用 == 。
       6) float类型: 使用Float.foatToIntBits转换成int类型，然后使用==。
       7) double类型: 使用Double.doubleToLongBit转换成long类型，然后使用==
 *
 */
public class Test {
    private String name ;
    private final int age = 5;
    
    public Test(String name){
    	this.name = name;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a =  "a";
        String b =  "a";
        if(a.equals(b)){
        	System.out.println("dddd");
        }
	}
	
	//覆写equals时推荐使用getClass进行类型判断。而不是使用instanceof
	@Override
	public boolean equals(Object object){  
        if(object.getClass() == Test.class){//(object instanceof Test){  
        	Test p = (Test) object;  
            if(p.getName() == null || name == null){  
                return false;  
            }  
            else{  
                return name.equalsIgnoreCase(p.getName());  
            }  
        }  
        return false;  
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
	
}
