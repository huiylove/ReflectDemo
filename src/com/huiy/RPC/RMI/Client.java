package com.huiy.RPC.rmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
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
public class Client {
	 public static void main(String[] args) {  
	        // ע�������  
	        Registry registry = null;  
	        try {  
	            // ��ȡ����ע�������  
	            registry = LocateRegistry.getRegistry("127.0.0.1",8088);  
	            // �г�����ע��ķ���  
	            String[] list = registry.list();  
	            for(String s : list){  
	                System.out.println(s);  
	            }  
	        } catch (RemoteException e) {  
	              
	        }  
	        try {  
	            // ����������ȡ����  
	            IService server = (IService) registry.lookup("vince");  
	            // ����Զ�̷���  
	            String result = server.queryName("world 2017!");  
	            // ������ý��  
	            System.out.println("result from remote : " + result);  
	        } catch (AccessException e) {  
	              
	        } catch (RemoteException e) {  
	              
	        } catch (NotBoundException e) {  
	              
	        }  
	    }  
}
