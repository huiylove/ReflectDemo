package com.huiy.designpattern.prototype;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class Client {
	 /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    
    private Prototype copy;

    
    public Client(){
    }
    
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    
    
    public void operation(Prototype example){
        //需要创建原型接口的对象
    	copy = prototype.clone();
    }
    
    
    
    public static void main(String[] args){
    	ConconcretePortotype1 cp1 = new ConconcretePortotype1();
    	Client client = new Client(cp1);
    	client.operation(cp1);
    	System.out.println("原型本身跟克隆是否一样"+(client.copy==client.prototype));
    }

}
