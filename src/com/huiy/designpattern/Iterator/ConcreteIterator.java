package com.huiy.designpattern.Iterator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregate Agg;
	private int index;
	private int size;
	
	public ConcreteIterator(ConcreteAggregate Agg){
		this.Agg = Agg;
		this.size = Agg.size();
		index =0 ;
	}

	@Override
	public void first() {
          index=0;
	}

	@Override
	public void next() {
		if(index<size){
			index++;
		}
	}
	
	 /**
     * 迭代方法：是否为最后一个元素
     */
	@Override
	public boolean isDone() {
		return index>=size;
	}

	@Override
	public Object currentItem() {
		return Agg.getElement(index);
	}

}
