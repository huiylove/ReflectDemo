package com.huiy.RPC.rmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月28日
 * @version 1.0
 *
 *
 */
public class Client {
	 public static void main(String[] args) {  
	        // 注册管理器  
	        Registry registry = null;  
	        try {  
	            // 获取服务注册管理器  
	            registry = LocateRegistry.getRegistry("127.0.0.1",8088);  
	            // 列出所有注册的服务  
	            String[] list = registry.list();  
	            for(String s : list){  
	                System.out.println(s);  
	            }  
	        } catch (RemoteException e) {  
	              
	        }  
	        try {  
	            // 根据命名获取服务  
	            IService server = (IService) registry.lookup("vince");  
	            // 调用远程方法  
	            String result = server.queryName("world 2017!");  
	            // 输出调用结果  
	            System.out.println("result from remote : " + result);  
	        } catch (AccessException e) {  
	              
	        } catch (RemoteException e) {  
	              
	        } catch (NotBoundException e) {  
	              
	        }  
	    }  
}
