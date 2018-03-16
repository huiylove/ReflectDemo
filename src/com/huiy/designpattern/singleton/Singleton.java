package com.huiy.designpattern.singleton;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��31��
 * @version 1.0
 * ��������ģʽ
 *
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
//	private static Singleton instance = null;

	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	

	//˫��У����
	//���ܻ����ָ�������򣬵õ�һ��δ��ʼ����ɵĶ���
//	public static Singleton getInstance(){
//		if(instance==null){
//			synchronized(Singleton.class){
//				if(instance==null){
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	
    //��̬�ڲ���
//	private static class SingletonHolder{
//		private static Singleton INSTANCE  = new Singleton();
//	}
	
//	public static final Singleton getInstance(){
//		return SingletonHolder.INSTANCE;
//	}
	
	public static void main(String[] args){
		EnumSingleton.whateverMethod().EnumPrint();
	}
	
}
