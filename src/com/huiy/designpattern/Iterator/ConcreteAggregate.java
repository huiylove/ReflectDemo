package com.huiy.designpattern.Iterator;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
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
