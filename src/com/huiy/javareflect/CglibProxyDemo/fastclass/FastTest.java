package com.huiy.javareflect.CglibProxyDemo.fastclass;
/** 
 * @author : yuanhui 
 * @date   : 2018��3��13��
 * @version 1.0
 * FastClass��ʵ���Ƕ�Class����������⴦������±����index��
 * ͨ���������淽����������Ϣ����ԭ�ȵķ�����ã�ת��Ϊ������ֱ�ӵ��ã��Ӷ�������ν��fast
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
