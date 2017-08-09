package com.huiy.designpattern.strategy;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 * ����ģʽ�������ڳ���ִ��ʱѡ��ͬ���㷨��
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
