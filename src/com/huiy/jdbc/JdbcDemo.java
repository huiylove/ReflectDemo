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
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��21��
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
			/* ͨ�ò�ѯ
			 * statement - ���Ƽ��������Ҫ������sql���
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
			 * Ԥ�����ѯ  http://www.importnew.com/5006.html
			 * 1.�������Ĳ�ѯ
			 * ���������ݱ���׼������һ��SQL��䣬���Ǵ�SQL���ľ���������ʱ�����ã�
			 * ����֮���ڽ������ã���ռס��λ�õȴ��û�����
			 * 2.�����Ż�
			 * SQL����Ԥ���������ݿ�ϵͳ��
			 * ���ݿ��SQL���ķ��������룬�Ż��Ѿ��ڵ�һ�β�ѯǰ�����
			 * 3.��ֹsqlע��
			 * ���Ὣ������������ΪSQLָ���һ�������������������ݿ����SQLָ��ı���󣬲����ò�������
			 *   
			 */
			PreparedStatement pStatement =null;
			String psql = "insert into user_t(user_name,password) values(?,?)";
			pStatement = conn.prepareStatement(psql);    //ʵ����
			pStatement.setString(1,"hello22");
			pStatement.setString(2, "world22");
			pStatement.executeUpdate();	
			/*PreparedStatement*/

			/*CallableStatement
			 * �洢���̲�ѯ
			 * */
			String csql="{call newproc(?,?,?)}";
			CallableStatement cstmt = conn.prepareCall(csql);
			cstmt.setInt(1,70);
			cstmt.setInt(2,80);
			cstmt.registerOutParameter(2,Types.INTEGER);      //���÷���ֵ����
			cstmt.registerOutParameter(3,Types.INTEGER);
			cstmt.execute();
            System.out.println("2:"+ cstmt.getInt(2));
            System.out.println("3:"+ cstmt.getInt(3));

			try{
//				statement.close();          //�ȿ���رգ�����ֻ�ر�connection 
				pStatement.close();
				cstmt.close();
				conn .close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
	}
	
	/*
	 * ���־�̬�����������Է����Լ��Ĳ�����������
	 * */
	public static <K,V> HashMap<K,V> newInstance(){
		return new HashMap<K,V>();
	}
}
