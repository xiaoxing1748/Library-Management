package com.java.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.library.Database;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String user_account,user_password;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("登录失败");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		user_account = request.getParameter("user_account");
		user_password = request.getParameter("user_password");
		if((user_account!="")&&(user_password!="")) {
			if(updateData()==1) {
				response.sendRedirect("./BookFind");
			}
		}else {
			System.out.println("未输入账号或密码");
		}
		doGet(request, response);
		
	}

//	更新方法
	private int updateData() {
		int login = 0;
		ResultSet rs = null;
		Connection con = null;
		con = (Connection)Database.getcon(con);
		PreparedStatement ps = null;
		String sql = "select * from account where user_account='"+user_account+"'and user_password = '"+user_password+"'";
		System.out.println(sql);
		try {
			ps=(PreparedStatement)Database.getps(con, sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				login = 1;
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println("login is "+login);
		return login;
	}
}