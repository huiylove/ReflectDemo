package com.huiy.springioc;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年7月6日
 * @version 1.0
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/com/huiy/springioc/beans.xml")  
public class SpringJunitTest {
	
		@Autowired
		private JavaCollection jc;
		
		@Test       
		public void junitTest(){
			List<String> customList = jc.getCustomList();
	        Iterator<String> it = customList.iterator();
	        while(it.hasNext()){
	        	System.out.println(it.next());
	        }
		}
}
