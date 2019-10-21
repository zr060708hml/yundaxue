package com.yundaxue.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yundaxue.pojo.Message;
import com.yundaxue.service.impl.PublishServiceImpl;
import com.yundaxue.service.impl.SearchMessageServiceImpl;

public class SearchMessageServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String mag = request.getParameter("lingshikeyzhi");
		PublishServiceImpl psi = new PublishServiceImpl();
		Message m = new Message();
		m.setMessage_content(mag);
		String publishMessageService = psi.publishMessageService(m);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
