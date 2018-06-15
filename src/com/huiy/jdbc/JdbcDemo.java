package com.huiy.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;
import com.mysql.jdbc.Driver;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月21日
 * @version 1.0
 *
 *
 */
public class JdbcDemo {
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER = "root";
	public static final String PASSWORD = "yuanhui";
	
	public static void main(String[] args)throws Exception{
			Connection conn=null;
			Statement statement=null;
			String sql = "insert into user_t(user_name,password) values('hello','world')";
			try{ 
	            Class.forName(DRIVER);  
	        }catch(ClassNotFoundException e){
	            e.printStackTrace() ;
	        }
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			/*Statement*/
			/* 通用查询
			 * statement - 不推荐，这个需要完整的sql语句
			   statement=conn.createStatement();
//			   statement.executeUpdate(sql);
            /* ResultSet */
			/*
                String qsql = "select * from user_t where id=2";
			    ResultSet rSet = statement.executeQuery(qsql);
			    while(rSet.next()){
//				int id = rSet.getInt("id");          //int id=rSet.getInt(1);
				String name = rSet.getString("user_name");  //String name=rSet.getString(2);
				String password = rSet.getString("password");          //....
				System.out.println(name+" "+password);	
			}
			*/
			
			/*PreparedStatement*/
			/*
			 * 预处理查询  http://www.importnew.com/5006.html
			 * 1.参数化的查询
			 * 是先在数据表中准备好了一条SQL语句，但是此SQL语句的具体内容暂时不设置，
			 * 而是之后在进行设置，即占住此位置等待用户设置
			 * 2.性能优化
			 * SQL语句会预编译在数据库系统中
			 * 数据库对SQL语句的分析，编译，优化已经在第一次查询前完成了
			 * 3.防止sql注入
			 * 不会将参数的内容视为SQL指令的一部分来处理，而是在数据库完成SQL指令的编译后，才套用参数运行
			 *   
			 */
			PreparedStatement pStatement =null;
			String psql = "insert into user_t(user_name,password) values(?,?)";
			pStatement = conn.prepareStatement(psql);    //实例化
			pStatement.setString(1,"hello22");
			pStatement.setString(2, "world22");
			pStatement.executeUpdate();	
			/*PreparedStatement*/

			/*CallableStatement
			 * 存储过程查询
			 * */
			String csql="{call newproc(?,?,?)}";
			CallableStatement cstmt = conn.prepareCall(csql);
			cstmt.setInt(1,70);
			cstmt.setInt(2,80);
			cstmt.registerOutParameter(2,Types.INTEGER);      //设置返回值类型
			cstmt.registerOutParameter(3,Types.INTEGER);
			cstmt.execute();
            System.out.println("2:"+ cstmt.getInt(2));
            System.out.println("3:"+ cstmt.getInt(3));

			try{
//				statement.close();          //先开后关闭，可以只关闭connection 
				pStatement.close();
				cstmt.close();
				conn .close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
	}
	
	/*
	 * 这种静态工厂方法可以放入自己的参数化的类中
	 * */
	public static <K,V> HashMap<K,V> newInstance(){
		return new HashMap<K,V>();
	}
}
