package com.huiy.javareflect.proxy;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月14日
 * @version 1.0
 */

/*
 *动态Proxy是这样的一种类:
 *它是在运行生成的类，在生成时你必须提供一组Interface给它，然后该class就宣称它实现了这些interface。
 *你可以把该class的实例当作这些interface中的任何一个来用。
 *当然，这个Dynamic Proxy其实就是一个Proxy，它不会替你作实质性的工作，
 *在生成它的实例时你必须提供一个handler，由它接管实际的工作
 *在使用动态代理类时，我们必须实现InvocationHandler接口
 */
public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过Proxy.newProxyInstance构建代理对象
//		RealSubject realSub = new RealSubject();
//		InvocationHandler handler = new DynamicSubject(realSub);
//		Class<?> classType = handler.getClass();
//		Subject sub = (Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSub.getClass().getInterfaces(), handler);
//		System.out.println(sub.getClass());  
//		//通过调用代理对象的方法去调用真实角色的方法
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
