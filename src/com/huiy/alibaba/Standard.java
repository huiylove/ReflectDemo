package com.huiy.alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.huiy.javaimprove.enumdemo.DateEnum;

/**
 * @author huiylove
 * @date 2019年5月14日
 */
/**
 * @author huiylove
 * @date 2019年5月14日
 */
public class Standard {
	
	//缩进四个空格
	//赋值运算符=，逻辑运算符&&，加减乘除号，三目运算符前后需要加空格
    private static final String CONSTANT_VALUE = "0000";//常量采用大写和下划线	

    
    /**
     * 方法参数定义和传入的时候，逗号后必须带上空格
     * 方法参数超过120个字符 不在逗号前换行
     * @param arg1
     * @param arg2
     * @param arg3
     */
    public static void method(int arg1, int arg2, int arg3,
    		int arg4,String a){
    	//if/for/do/while/switch等保留字与左右括号必须加空格
    	//关键词if与括号之间必须有一个空格，左括号和arg1,0与右括号不需要空格、
    	//左大括号前加空格且不换行；左大括号后换行
    	if (arg1 == 0) {
    		
    	//右大括号前换行，右大括号后有else,不用换行
    	} else {
    		
    	}
    	
    	//能用于switch判断的类型有：byte、short、int、char（JDK1.6），还有枚举类型，但是在JDK1.7后添加了对String类型的判断
    	switch (arg1) {
    		case 1:
    			break;
    		case 2:
    			break;
    		default:
    			break;
    	}
    	
    	
    	switch (DateEnum.getByValue(arg1)) {
		case MONDAY:
			break;
		case FRIDAY:
			break;
		default:
			break;
    	}
    	
    	//方法内的不同执行语句组，变量的定义语句组可以插入一行空行，不需要多行
    	//超过120个字符的情况下，换行缩进4个空格，方法前.符号一起换行
    	StringBuilder sb = new StringBuilder();
    	sb.append("....").append("....")
    	    .append(".....").append(".....")
    	    .append(".....").append(".....");
    	
    }
    
    public static void main(String[] args) {
    	final String fs = "ddd";
    	method(1,1,1,1,fs);
    	System.out.println(fs);
    	String[] str = new String[] { "a", "b" };
    	List list = Arrays.asList(str);//返回的是Arrays的内部类ArrayList，并没有实现集合的修改方法（add/remove/clear）
    	str[0] = "c";
    	System.out.println(list.get(0));
    	List<String> a = new ArrayList<String>();
    	a.add("1");
    	a.add("2");
    	//反例  foreach循环里remove
    	for (String temp : a) {
	    	if("2".equals(temp)){
	    		a.remove(temp);
	    	}
    	}
//    	//正例  Iterator方式执行remove
//    	Iterator<String> it = a.iterator();
//    	while(it.hasNext()){
//    		String temp = it.next();
//    		if("2".equals(temp)){
//    			it.remove();
//    		}
//    	}
    	//自定义Comparator对象，自定义排序
		Comparator<Integer> c = (o1,o2)->{
			if (o1<o2) {
				return 1;
			} else {
				return 1;
			}
		};
		
//		new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				if((int)o1<(int)o2)
//					return 1;
//				//注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
//		//		else return 0; //无效
//				else return -1;
//			}
//		};		
    	
	}
}
