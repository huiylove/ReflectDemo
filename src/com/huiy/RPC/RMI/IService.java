package com.huiy.RPC.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��28��
 * @version 1.0
 *  RPC����Ҫ�������������л��������л��ʹ���Э��
 *  RMI-Զ�̷�������,JAVA�Դ���RPC���
 */
public interface IService extends Remote{
	public String queryName(String no) throws RemoteException;  
}
