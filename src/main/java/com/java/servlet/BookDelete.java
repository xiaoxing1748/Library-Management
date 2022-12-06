package com.java.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.java.library.Database;

/**
 * Servlet implementation class BookDelete
 */
@WebServlet("/BookDelete")
@SuppressWarnings("serial")
public class BookDelete extends HttpServlet {
	private String book_id;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		book_id = request.getParameter("temp_id");
		if(book_id!="") {
			deleteData();
		}else {
			System.out.println("book_id为空，什么都不会发生");
		}
		response.sendRedirect("index.jsp");
		doGet(request, response);
	}
//	删除方法
	private void deleteData() {
		Connection con = null;
		con = (Connection)Database.getcon(con);
		PreparedStatement ps = null;
		String deletesql = "delete from book where book_id="+book_id;
		System.out.println(deletesql);
		try {
			ps=(PreparedStatement)Database.getps(con, deletesql);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "删除失败","错误",JOptionPane.ERROR_MESSAGE);
		}			
	}

}
