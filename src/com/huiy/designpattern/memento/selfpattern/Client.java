package com.huiy.designpattern.memento.selfpattern;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月18日
 * @version 1.0
 * 在“自述历史”模式里面，发起人角色自己兼任负责人角色
 * 
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        MementoIF memento = o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
    }

}
