package com.huiy.designpattern.state;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月18日
 * @version 1.0
 * 在状态模式中，环境(Context)是持有状态的对象，但是环境(Context)自身并不处理跟状态相关的行为，
         而是把处理状态的功能委托给了状态对应的状态处理类来处理。
         在具体的状态处理类中经常需要获取环境(Context)自身的数据， 甚至在必要的时候会回调环境(Context)的方法，
         因此，通常将环境(Context)自身当作一个参数传递给具体的状态处理类。
 */

public class Client {

    public static void main(String[] args) {
        
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }

}