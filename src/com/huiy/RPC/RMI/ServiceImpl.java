package com.huiy.RPC.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月28日
 * @version 1.0
 *
 *
 */
public class ServiceImpl extends UnicastRemoteObject implements IService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8357047471678769229L;

	protected ServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String queryName(String no) throws RemoteException {
		// 方法的具体实现  
        System.out.println("hello" + no);  
        return String.valueOf(System.currentTimeMillis());  
	}

}
