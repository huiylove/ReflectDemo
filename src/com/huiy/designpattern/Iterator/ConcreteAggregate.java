package com.huiy.designpattern.Iterator;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public class ConcreteAggregate extends Aggregate {
	
	private Object[] objectArray;
	
	public ConcreteAggregate(Object[] objectArray){
		this.objectArray = objectArray;
		
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	 
	public Object getElement(int index){
		if(index<objectArray.length){
			return objectArray[index];
		}else{
			return null;
		}
	}
	
	public int size(){
		return objectArray.length;
	}

}
