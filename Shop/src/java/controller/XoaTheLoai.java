/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DanhMucDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dinhhuy
 */
public class XoaTheLoai extends HttpServlet {

   private static final long serialVersionUID = 1L;
	private DanhMucDAOImpl danhmucDAO=new DanhMucDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XoaTheLoai() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ma_danh_muc=request.getParameter("ma_danh_muc");
		danhmucDAO.delDanhMuc(ma_danh_muc);
		response.sendRedirect("/Shop/quan_ly_the_loai.jsp");
	}
}
