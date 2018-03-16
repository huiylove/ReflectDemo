package com.huiy.springioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * �๦������
 * @author : yuanhui 
 * 
 * @date   : 2018��2��11��
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/com/huiy/springioc/beans.xml")  
public class BeanLifeCycle {
	
	@Autowired
	private Grade GradeBean;

	@Test       
	public void junitTest(){
		System.out.println(GradeBean.getEnglish());
	}
}
