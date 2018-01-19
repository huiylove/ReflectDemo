package com.huiy.designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public class Client {
	
	 public static void main(String[] args){
	        Client client = new Client();
	        client.operation();
    }
	
	
	 public void operation(){
	        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
	        //创建聚合对象
	        Aggregate agg = new ConcreteAggregate(objArray);
	        //循环输出聚合对象中的值
	        Iterator it = agg.createIterator();
	        while(!it.isDone()){
	            System.out.println(it.currentItem());
	            it.next();
	        }
	    }

}
