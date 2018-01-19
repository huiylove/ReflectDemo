package com.huiy.designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��19��
 * @version 1.0
 */
public class Client {
	
	 public static void main(String[] args){
	        Client client = new Client();
	        client.operation();
    }
	
	
	 public void operation(){
	        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
	        //�����ۺ϶���
	        Aggregate agg = new ConcreteAggregate(objArray);
	        //ѭ������ۺ϶����е�ֵ
	        Iterator it = agg.createIterator();
	        while(!it.isDone()){
	            System.out.println(it.currentItem());
	            it.next();
	        }
	    }

}
