package com.huiy.RPC.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��28��
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
		// �����ľ���ʵ��  
        System.out.println("hello" + no);  
        return String.valueOf(System.currentTimeMillis());  
	}

}
