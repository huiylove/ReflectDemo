package com.huiy.designpattern.strategy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 *
 *
 */
public class StrategyA extends Strategy{
	
	private String paramA;
	private String paramB;
	
	public StrategyA(String paramA,String paramB){
		this.paramA = paramA;
		this.paramB = paramB;
	}
	@Override
	public void AlgorithmInterface() {
		System.out.print(paramA+" "+paramB+"!");
	}

}
