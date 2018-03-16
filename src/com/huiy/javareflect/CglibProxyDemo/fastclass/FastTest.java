package com.huiy.javareflect.CglibProxyDemo.fastclass;
/** 
 * @author : yuanhui 
 * @date   : 2018年3月13日
 * @version 1.0
 * FastClass其实就是对Class对象进行特殊处理，提出下标概念index，
 * 通过索引保存方法的引用信息，将原先的反射调用，转化为方法的直接调用，从而体现所谓的fast
 */
public class FastTest {
	 
	public int getIndex(String signature) {

		switch (signature.hashCode()) {

		case 3078479:

			return

			1;

		case

		3108270:

			return

			2;

		}

		return

		-1;

	}

	public Object invoke(int index,

	Object o,

	Object[] ol) {

		Test t =  (Test) o;

		switch (index) {

		case 1:t.f();
			    return null;

		case 2:t.g();
            return null;

		}
		return null;

	}
}
