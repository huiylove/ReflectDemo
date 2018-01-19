package com.huiy.designpattern.Iterator.black;


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
		return new ConcreteIterator();
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
	
	private class ConcreteIterator implements Iterator{
		
		private int index;
		private int size;
		
		public ConcreteIterator(){
			index=0;
			size = objectArray.length;
		}

		@Override
		public void first() {
			index = 0;
		}

		@Override
		public void next() {
			if(index<size) index++;
		}

		@Override
		public boolean isDone() {
			return index>=size;
		}

		@Override
		public Object currentItem() {
			return objectArray[index];
		}
		
	}

}
