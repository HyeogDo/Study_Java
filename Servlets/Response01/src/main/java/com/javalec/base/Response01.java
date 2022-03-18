package com.javalec.base;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Response01
 */
@WebServlet("/response01")
public class Response01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Response01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String siteName = request.getParameter("siteName");
		
		switch (siteName) {
		case "naver": 
			response.sendRedirect("https://www.naver.com");
			break;
		case "daum": 
			response.sendRedirect("https://www.daum.net");
			break;
		case "google": 
			response.sendRedirect("https://www.google.com");
			break;

		
		default:
			response.sendRedirect("https://www.yahoo.com");
			break;
		}
	}

}
