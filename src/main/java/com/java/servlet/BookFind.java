package com.java.servlet;
import com.java.library.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class BookFind
 */
@WebServlet("/BookFind")
public class BookFind extends HttpServlet {

//	私有字符串变量book_id,book_title,book_info
	private String book_id,book_title,book_info;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFind() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
//		以书本标题为查找关键字
		book_title = request.getParameter("book_title");
//		System.out.println(selectData());
		request.setAttribute("BookList", selectData());
		request.getRequestDispatcher("./index.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
	private List<Book> selectData() {
		System.out.println("book_title is "+book_title);
		ResultSet rs = null;
		List<Book> BookList = new ArrayList<Book>();
		Connection con = null;
		con = (Connection)Database.getcon(con);
		PreparedStatement ps = null;
		String querysql = "select * from book where book_title like '%"+book_title+"%'";
		System.out.println("querysql is "+querysql);
		try {
			ps=(PreparedStatement)Database.getps(con, querysql);	
//			ps.setString(1, book_title);
//			ps.executeQuery();
			rs=ps.executeQuery();
			while(rs.next()) {
				Book temp = new Book();
				temp.setBookId(rs.getInt("book_id"));
				temp.setBookTitle(rs.getString("book_title"));
				temp.setBookInfo(rs.getString("book_info"));
				BookList.add(temp);
				System.out.println(temp);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "搜索失败","失败",JOptionPane.ERROR_MESSAGE);
		}
//		System.out.println(temp);
//		System.out.println(BookList);
		return BookList;
	}
}
