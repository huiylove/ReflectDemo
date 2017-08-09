package com.huiy.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月22日
 * @version 1.0
 *
 *
 */
public class RowCallbackHandlerImpl implements RowCallbackHandler{

	@Override
	public void processRow(ResultSet rs) throws SQLException {
		//2.处理结果集 
		 String value = rs.getString("USER_NAME"); 
		 System.out.println("Column USER_NAME:" + value); 
	}
}
