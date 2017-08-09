package com.huiy.designpattern.strategy;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月31日
 * @version 1.0
 * 策略模式：允许在程序执行时选择不同的算法。
 *
 */
public class Context {
	
	Strategy strategy;
	
	Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	Context(int type){
		switch(type)
		{
			case 1: this.strategy = new StrategyA("hello","world");
		}
	}

	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
}
