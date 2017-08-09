package com.huiy.designpattern.decoratorexam;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class Test {
	
	public static void main(String[] args){
		Cake cake = new Bread();
		cake = new Lettuce(cake,1);
		Cake cake1 = new Egg(cake,2);
		cake1 = new Tenderloin(cake1,1);
        System.out.println(cake1.getDescription() + "\n价格：" + cake1.cost()+"元\n");  
        Cake cake2 = new Egg(cake,1);
        cake2 =	new Bacon(cake2,1);
        System.out.println(cake2.getDescription() + "\n价格：" + cake2.cost()+"元\n");  

	}
}
