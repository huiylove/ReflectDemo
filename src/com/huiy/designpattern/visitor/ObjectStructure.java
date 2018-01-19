package com.huiy.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 * 动态的单分配——动态分派仅仅会考虑到方法的接收者的类型
 * 静态的多分配——对重载方法的分派会考虑到方法的接收者的类型以及方法的所有参数的类型 
 * 一个方法根据两个宗量的类型来决定执行不同的代码，这就是“双重分派”
 */

public class ObjectStructure {
    
    private List<Node> nodes = new ArrayList<Node>();
    
    /**
     * 执行方法操作
     */
    public void action(Visitor visitor){
        
        for(Node node : nodes)
        {
            node.accept(visitor);
        }
        
    }
    /**
     * 添加一个新元素
     */
    public void add(Node node){
        nodes.add(node);
    }
}