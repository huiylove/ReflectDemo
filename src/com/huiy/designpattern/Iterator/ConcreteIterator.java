package com.huiy.designpattern.Iterator;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
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
     * �����������Ƿ�Ϊ���һ��Ԫ��
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
