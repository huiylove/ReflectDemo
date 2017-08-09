package com.huiy.designpattern.abstractfactory;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 *
 *
 */
public class NYStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;  
	
	NYStyleCheesePizza(){
		this.name = "Ny Style Sauce and Cheese Pizza";  
	}
	
	/* 
     * Ҫ������������Ҫ������������ԭ�ϣ�����Щԭ���Ǵ�ԭ�Ϲ��������� 
     */  
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory){  
        this.ingredientFactory = ingredientFactory;  
        prepare();  
    }  
	
    /** 
     * ʵ��prepare���� 
     * prepare ����һ��һ���ش���֥ʿ������ÿ����Ҫԭ��ʱ���͸�����Ҫ 
     */  
    public void prepare() {  
        System.out.println("Prepareing " + name);
        //���ù����ķ���
        
    }  
}
