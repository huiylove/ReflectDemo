package com.huiy.httpclient;

/**
 * �๦������
 * CommonException.java
 *
 * @history 2015��3��23�� ���� ����CommonException.java
 * 
 * @author ����
 * @version 0.1.0
 */
public class CommonException extends RuntimeException {

	/**
	 * @fields serialVersionUID 
	 */
	private static final long serialVersionUID = 4081863331832266720L;

	public CommonException() {
		super();
	}

	public CommonException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommonException(String message) {
		super(message);
	}

	public CommonException(Throwable cause) {
		super(cause);
	}

}