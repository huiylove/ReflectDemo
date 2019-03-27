package com.huiy.distribute.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @author huiylove
 * @date 2019年3月27日
 */
public class CuratorInLock {
	public static void main(String[] args) {
		//创建zookeeper的客户端
		RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183",retryPolicy);

		client.start();

		//创建分布式锁, 锁空间的根节点路径为/curator/lock

		InterProcessMutex mutex = new InterProcessMutex(client, "/curator/lock");

		try {
			
	     mutex.acquire();
		
		//获得了锁, 进行业务流程

		System.out.println("Enter mutex");

		//完成业务流程, 释放锁

		mutex.release();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//关闭客户端

		client.close();
	}
}
