package com.huiy.RPC.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��28��
 * @version 1.0
 *
 *
 */
public class Server {
	 public static void main(String[] args) {  
	        // ע�������  
	        Registry registry = null;  
	        try {  
	            // ����һ������ע�������  
	            registry = LocateRegistry.createRegistry(8088);  
	        } catch (RemoteException e) {  
	              
	        }  
	        try {  
	            // ����һ������  
	            ServiceImpl server = new ServiceImpl();  
	            // �����������  
	            registry.rebind("vince", server);  
	            System.out.println("bind server");  
	        } catch (RemoteException e) {  
	              
	        }  
	}  
}
