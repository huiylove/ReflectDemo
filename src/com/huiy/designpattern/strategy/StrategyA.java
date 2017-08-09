package com.huiy.designpattern.strategy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
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
