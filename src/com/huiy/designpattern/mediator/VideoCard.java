package com.huiy.designpattern.mediator;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月19日
 * @version 1.0
 */
public class VideoCard extends Colleague {
    /**
     * 构造函数
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 显示视频数据
     */
    public void showData(String data){
        System.out.println("您正在观看的是：" + data);
    }
}
