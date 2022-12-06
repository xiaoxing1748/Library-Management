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
 * Servlet implementation class BookUpdate
 */
@WebServlet("/BookUpdate")
public class BookUpdate extends HttpServlet {
    private static final long serialVersionUID = 1L;
    //	私有字符串变量book_id,book_title,book_info
    private String book_id, book_title, book_info, temp_id;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookUpdate() {
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
        book_id = request.getParameter("book_id");
        temp_id = request.getParameter("temp_id");
        book_title = request.getParameter("book_title");
        book_info = request.getParameter("book_info");
        if (book_id != "") {
            updateData();
        } else {
            System.out.println("book_id为空，什么都不会发生");
        }
        response.sendRedirect("index.jsp");
        doGet(request, response);

    }

    //	更新方法
    private void updateData() {
        Connection con = null;
        con = (Connection) Database.getcon(con);
        PreparedStatement ps = null;
        String updatetsql = "update book set `book_id`=" + book_id + ",`book_title`='" + book_title + "',`book_info`='" + book_info + "' where `book_id`=" + temp_id;
        System.out.println(updatetsql);
        try {
            ps = (PreparedStatement) Database.getps(con, updatetsql);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "数据修改错误", "错误", JOptionPane.ERROR_MESSAGE);
        }
    }
}
