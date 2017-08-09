package com.huiy.javaannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


	/**
	 * @Target�����ע���������ElementType.METHOD�����ע�����������б�METHOD�Ƿ�������������֮�⣬���У�
		CONSTRUCTOR�����췽��������,FIELD���ֶ�������,LOCAL VARIABLE���ֲ�����������,METHOD������������,PACKAGE����������,PARAMETER������������,TYPE����ӿڣ�
		
		�ڶ��У�@Retention�������������ڣ�ǰ�治��˵ע�ⰴ�����л�����һ�������RUNTIME����������ʱ���ڣ�����ͨ�������ȡ������֮�⣬����:
		SOURCE��ֻ��Դ����ʾ������ʱ������,CLASS������ʱ��¼��class�У�����ʱ���ԣ�,RUNTIME������ʱ���ڣ�����ͨ�������ȡ��
		
		�����У�@Inherited��һ����ʶ�Ե�Ԫע�⣬��������ע��̳�����
		
		�����У�@Documented������javadocʱ�����ע�⡣
		
		ʹ���Զ���ע�⣺
		ʹ��ע����﷨��
		@<ע����>(<��Ա��1>=<��Աֵ1>,<��Ա��1>=<��Աֵ1>,��)

	 * 
	 * */
	@Target({ElementType.METHOD,ElementType.TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@Inherited
	@Documented
	public @interface Description {
	    String value();
	}

