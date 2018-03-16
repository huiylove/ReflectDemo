package com.huiy.httpclient;

/**
 * 类功能描述
 * CommonException.java
 *
 * @history 2015年3月23日 颜曦 创建CommonException.java
 * 
 * @author 颜曦
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