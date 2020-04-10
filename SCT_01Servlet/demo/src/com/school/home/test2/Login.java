package com.school.home.test2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<head>"
				+ "<title>登录</title>"
				+ "</head>"
				+ "<body>"
				+ "<form action = 'Message' method = 'post'>"
				+ "用户名：<input type = 'text' name = 'name' /><br />"
				+ "密码：<input type='password' name = 'password' /><br />"
				+ "性别：<input type=\"radio\" name=\"sex\" value=\"男\" />男<input type=\"radio\" name=\"sex\" value=\"女\" />女<br>\r\n" 
				+ "爱好：<input type=\"checkbox\" name = \"hobby\" value = \"Java\">Java\r\n" + 
				"<input type=\"checkbox\" name = \"hobby\" value = \"python\">python\r\n" + 
				"<input type=\"checkbox\" name = \"hobby\" value = \"c\">c\r\n" + 
				"<input type=\"checkbox\" name = \"hobby\" value = \"c++\">c++<br>"
				+ "日期：<input type=\"date\" name=\"date\" ><br>"
				+ "<input type='submit' value ='登录' />"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
