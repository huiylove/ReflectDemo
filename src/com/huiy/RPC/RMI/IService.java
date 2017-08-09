package com.huiy.RPC.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月28日
 * @version 1.0
 *  RPC的主要依赖技术是序列化、反序列化和传输协议
 *  RMI-远程方法调用,JAVA自带的RPC框架
 */
public interface IService extends Remote{
	public String queryName(String no) throws RemoteException;  
}
