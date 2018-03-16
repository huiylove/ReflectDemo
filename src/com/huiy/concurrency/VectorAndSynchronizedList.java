package com.huiy.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年3月5日
 * @version 1.0
 */
public class VectorAndSynchronizedList {
	public static void main(String[] args){
		Vector<String> v = new Vector<String>();
		Iterator it = v.iterator();
		List list = Collections.synchronizedList(new ArrayList());
	}
}
