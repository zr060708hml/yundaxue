package com.yundaxue.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yundaxue.pojo.UserInfo;
import com.yundaxue.service.impl.LoginServiceImpl;
/**
 * 
 * @author ZZ
 *
 */
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginServiceImpl lsi= new LoginServiceImpl();
		UserInfo ui = new UserInfo(); 
		ui.setUser_name(username);
		ui.setUser_password(password);
		String login = lsi.login(ui);
		request.setAttribute("login", login);
		if(login.equals("��¼�ɹ�")){
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}else{
			response.sendRedirect("index.jsp");
		}

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
