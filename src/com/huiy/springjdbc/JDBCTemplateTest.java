package com.huiy.springjdbc;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月22日
 * @version 1.0
 *
 *
 */
public class JDBCTemplateTest {
	
	 private static JdbcTemplate jdbcTemplate; 
	 
	 @BeforeClass
	 public static void setUpClass() { 
	 String url = "jdbc:db2://localhost:50000/sample2"; 
	 String username = "db2admin"; 
	 String password = "db2"; 
	 DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password); 
	 dataSource.setDriverClassName("com.ibm.db2.jcc.DB2Driver"); 
	 	jdbcTemplate = new JdbcTemplate(dataSource); 
	 } 
	 
	 
	 @Test
	 public void test() { 
		 //1.声明SQL 
		 String sql = "select * from DB2ADMIN.USER_T where id=?"; 
		 RowMapper<UserTPO> rowMapper = new BeanPropertyRowMapper<UserTPO>(UserTPO.class);//查询结果映射到对象
		 UserTPO user = jdbcTemplate.queryForObject(sql,rowMapper,1);
		 System.out.println(user.getUserName());
//		 jdbcTemplate.query(sql,new RowCallbackHandlerImpl());
	}
	 
}
