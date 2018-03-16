package com.huiy.javastatic;
/** 
 * @author : yuanhui 
 * @date   : 2018��3��14��
 * @version 1.0
 * ���ǣ�浽static���������еļ���ʱ��ͷǾ�̬����������ʱ�䣻
1. final ���εı���ֻ��һ�θ�ֵ������ܸı䣻
   final���α����󣬿��Բ���������ֵ������static finalͬʱ���ε�����������ھ�̬������и�ֵ��
        ����ֻ��final���ε���ķǾ�̬���������ڷǾ�̬������������й��캯���и�ֵ��
2. Ϊʲô�����ڷǾ�̬������и�ֵ
       ����ص�ʱ��Ὣ��̬����������ص���������������£����ڻ�û�б���ʼ����static final������java��Ϊ���д���ģ�
       ʹ�÷Ǿ�̬����鸳ֵ���е�ԭ���ǣ��Ǿ�̬���������ʱ�ڶ�����ʱ�����У������ྲ̬�������ؽ���������ʱ�䣻
 * 
 * �Լ�����⣺
 * static final����ֻ���ھ�̬������и�ֵ     static����������ص�ʱ���������ڴ����ͳ�ʼ��
 * final���ε���ķǾ�̬���������ڷǾ�̬������������й��캯���и�ֵ
 * �Ǿ�̬���������ʱ�ڶ�����ʱ�����У������ྲ̬�������ؽ���������ʱ�䣻
 * 
 * java������ʹ��ǰ�����ʼ��
 * 1.�������ڷ����������ľֲ���������������ֶ�������ʾ�ĳ�ʼ��
   2.�������������еĳ�Ա��������������Զ������ʼ�� Ϊ���� 0 ֵ����ֵ����Ϊ0 �ַ���Ϊ����Ϊ0���Ǹ� boolean Ϊfalse�����뻹��0�������ͳ�ʼ��Ϊnull��
             �Ƚ������һ�ֱ���final������г����� һ����ֵ��ʼ��֮��Ͳ��ܸ��� �����ֱ�������Ҳ֪�������ֶ���ֵ��ʼ���ˣ�����������㸳ֵ��0��ɶ���أ����ֲ��ܸ�����ֵ����
            �����ٰ�������1��2��ԭ��
     1.�ֲ���final�ͱ�������ֻҪ��ʹ��ǰ�����ֶ���ʼ������
     2.final��Ա����Ҫô����������ʱ��͸�ֵ�ˣ�
             Ҫô����������ʱ��û��ֵ�Ļ����ͱ��������ڵ���ʵ������ʱ��͸�ֵ�ˣ������������еĹ��췽���г�ʼ���ˣ�
 * 
 */
public class MethodInvokeTest {
	private static int s_value;
	private static final int sf_value;
	private final int f_value;
	
	static{
		System.out.println("��̬����鸳ֵǰ"+s_value);
		sf_value = 2;
		System.out.println("��̬����鸳ֵ��"+sf_value);
	}
	
	{
		f_value = 3;
		System.out.println("�Ǿ�̬����鸳ֵ��"+f_value);

	}

	public MethodInvokeTest(){
//		f_value = 4;
	}
	
	public  void M(){
		System.out.println("ʵ������M");
	}
	
	public static void staticM(){
		MethodInvokeTest test = new MethodInvokeTest();
		test.M();
		s_value = 6;
		System.out.println("��̬�ظ���̬������ֵ��"+s_value);
		System.out.println("��̬����M");
	}

	public static void staticM1(){
		staticM();
		System.out.println("��̬����M1");
	}
	
	public static void main(String[] args) {
//		staticM();
//	
		
	}
	

}
