/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAOImpl;
import dao.SanPhamDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dinhhuy
 */
@WebServlet(name = "Xoa_san_phamServlet", urlPatterns = {"/Xoa_san_phamServlet"})
public class Xoa_san_phamServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;
	private SanPhamDAOImpl sanphamDAO=new SanPhamDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Xoa_san_phamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ma_san_pham=request.getParameter("ma_san_pham");
		sanphamDAO.delSanPham(ma_san_pham);
		response.sendRedirect("/Shop/quan_ly_san_pham.jsp");
	}
}