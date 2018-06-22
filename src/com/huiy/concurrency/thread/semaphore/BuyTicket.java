package com.huiy.concurrency.thread.semaphore;
/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月15日
 * @version : 1.0
 * 业务场景：买火车票
 * 2个售票窗口，20个人同时去排队买票
 * 同一时间只有2个人可以买票
 * 拆解： 20个人就是20个线程，2个窗口就是资源
 * 
 * 实际含义： 控制同一时间的并发数 2
 * 
 * Semaphore 信号量  (控制并发线程数)
 * 
 */
public class BuyTicket {


}
