package com.huiy.javareflect.proxy;


/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��14��
 * @version 1.0
 */

/*
 *��̬Proxy��������һ����:
 *�������������ɵ��࣬������ʱ������ṩһ��Interface������Ȼ���class��������ʵ������Щinterface��
 *����԰Ѹ�class��ʵ��������Щinterface�е��κ�һ�����á�
 *��Ȼ�����Dynamic Proxy��ʵ����һ��Proxy��������������ʵ���ԵĹ�����
 *����������ʵ��ʱ������ṩһ��handler�������ӹ�ʵ�ʵĹ���
 *��ʹ�ö�̬������ʱ�����Ǳ���ʵ��InvocationHandler�ӿ�
 */
public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ��Proxy.newProxyInstance�����������
//		RealSubject realSub = new RealSubject();
//		InvocationHandler handler = new DynamicSubject(realSub);
//		Class<?> classType = handler.getClass();
//		Subject sub = (Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSub.getClass().getInterfaces(), handler);
//		System.out.println(sub.getClass());  
//		//ͨ�����ô������ķ���ȥ������ʵ��ɫ�ķ���
//		sub.Request();
        try {
        	MyInvocationHandler demo = new MyInvocationHandler();
        	RealSubject rs = new RealSubject();
            Subject sub = (Subject) demo.bind(rs);
//            Object[] args1 = {"huiy",25};
//			String info = (String)demo.invoke(rs,rs.getClass().getDeclaredMethod("say",String.class,int.class),args1);
	        String info = sub.say("Rollen", 20);
	        System.out.println(info);
        } catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		} 
    
	}

}
