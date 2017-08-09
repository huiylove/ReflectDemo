package com.huiy.refactor.demo.eight16;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月5日
 * @version 1.0
 *
 *
 */
public class Person {
    private final boolean _isMale;
    private final char _code;
    
    protected Person(boolean isMale,char code){
    	this._isMale = isMale;
    	this._code = code;
    }
    
    static Person createMale(){
       return new Person(true,'M');	
    }

	public boolean isMale() {
		return _isMale;
	}

	public char getCode() {
		return _code;
	}
    
}
