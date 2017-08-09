package com.huiy.designpattern.factory;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public class Operation {
	public static double GetResult(double numA,double numB,String operate){
		double result = 0d;
//		switch(operate){
//			case "+": 
//				result = numA+numB;
//				break;
//			case "-": 
//				result = numA-numB;
//				break;
//			case "*": 
//				result = numA*numB;
//				break;
//			case "/": 
//				if(numB==0){
//					System.out.print("除数不能为0");
//				}else{
//					result = numA/numB;
//				}
//				break;
//		}
		return result;
	}
}
