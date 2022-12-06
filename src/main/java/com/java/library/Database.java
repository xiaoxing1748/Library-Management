package com.java.library;
import java.sql.*;

public class Database {
		
//	数据库连接方法
		public static Connection getcon(Connection con) {			
			String dbname= "library";
			String username="root";
			String password="";	
			String host="localhost:3306";
			String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&characterEncoding=utf8";
//			String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT+8&useUnicode=true&characterEncoding=utf8";

			try {				
				con = null;
//				Class.forName("com.mysql.cj.jdbc.Driver");
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,username,password);
				System.out.println("connect success by method getcon");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
		
//		数据库关闭方法
		public static void closecon(Connection con) {
			if(con!=null) {
				try {
					con.close();
					System.out.println("connection has been closed by method closecon");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				con=null;
			}
		}
		
//		Statement方法
		public static Statement getsta(Connection con) {
			Statement sta = null;
			try {
				sta=con.createStatement();
				System.out.println("Statement has been created by method getsta");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return sta;					
		}
//		closeStatement方法
		public static void closesta(Statement sta) {
			if(sta!=null) {
				try {
					sta.close();
					System.out.println("Statement has been closed by method closesta");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sta=null;
		}
		
//		PreparedStatement方法
		public static PreparedStatement getps(Connection con,String sql) {
			PreparedStatement ps = null;
			try {
				ps=con.prepareStatement(sql);
//				ps.execute();
				System.out.println("更新成功|Update success by method getps");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return ps;			
		}
		
//		getResultSet方法
		public static ResultSet getrs(Statement sta,String sql) {
			ResultSet rs=null;
			try {
				rs=sta.executeQuery(sql);
				System.out.println("getResultSet success by method getrs");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}
//		closeResultSet方法
		public static void closers(ResultSet rs) {
			if(rs!=null) {
				try {
					rs.close();
					System.out.println("closeResultSet success by method closers");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			rs=null;
		}
		
//		Update方法
		public static void executeUpdate(Connection con,String sql) {
			Statement sta=null;
			try {
				sta=con.createStatement();
				sta.execute(sql);
				System.out.println("Update success by method executeUpdate");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


//		Query方法
		public static void executeQuery(Connection con,String sql) {
			Statement sta=null;
			try {
				sta=con.createStatement();
				sta.execute(sql);
				System.out.println("Update success by method executeQuery");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}



		


