package com.java.servlet;

import com.mysql.fabric.Response;
import com.java.library.*;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


/**
 * Servlet implementation class BookAdd
 */
@WebServlet("/BookAdd")
public class BookAdd extends HttpServlet {

    //	私有字符串变量book_id,book_title,book_info
    private String book_id, book_title, book_info;
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookAdd() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        book_id = request.getParameter("book_id");
        book_title = request.getParameter("book_title");
        book_info = request.getParameter("book_info");
        if (book_id != "") {
            insertData();
        } else {
            System.out.println("book_id为空，什么都不会发生");
        }
        response.sendRedirect("index.jsp");
        doGet(request, response);

    }

    //	插入方法
    private void insertData() {
        Connection con = null;
        con = (Connection) Database.getcon(con);
        PreparedStatement ps = null;
        String insertsql = "insert into book (book_id,book_title,book_info) values (?,?,?)";
        try {
            ps = (PreparedStatement) Database.getps(con, insertsql);
            ps.setString(1, book_id);
            ps.setString(2, book_title);
            ps.setString(3, book_info);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "数据插入错误", "错误", JOptionPane.ERROR_MESSAGE);
        }
    }
}
