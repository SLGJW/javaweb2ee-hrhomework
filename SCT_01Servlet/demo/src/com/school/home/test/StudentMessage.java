package com.school.home.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class MyServlet
 */
public class StudentMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");//���÷��������ͻ�����Ӧ���������ͣ�ָ�����뷽ʽ������ظ��ͻ����������������
        request.setCharacterEncoding("UTF-8");//���Post�����������������
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String date = request.getParameter("date");
		out.println("�û���Ϊ��" + username + "<br>");
		out.println("����Ϊ��" + password + "<br>");
		out.println("�Ա�Ϊ��" + sex + "<br>");
		String [] list = request.getParameterValues("hobby");
		String hobby = "";
		for (String s : list) {
			hobby += s + "��";
		}
		out.println("����Ϊ��" + hobby + "<br>");
		out.println("����Ϊ��" + date + "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
