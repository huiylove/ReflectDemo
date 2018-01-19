package com.huiy.designpattern.memento;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月18日
 * @version 1.0
 * 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。
 * 备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，
 * 从而可以在将来合适的时候把这个对象还原到存储起来的状态。
 * 备忘录模式常常与命令模式和迭代子模式一同使用。
 */
public class Client {

    public static void main(String[] args) {
        
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        //改变负责人对象的状态
        o.setState("On");
        //创建备忘录对象，并将发起人对象的状态储存起来
        c.saveMemento(o.createMemento());
        //修改发起人的状态
        o.setState("Off");
        //恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());
        
        System.out.println(o.getState());
    }

}
