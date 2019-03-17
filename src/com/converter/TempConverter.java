package com.converter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TempConverter
 */
@WebServlet("/TempConverter")
public class TempConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double value1 = Double.parseDouble(request.getParameter("value1"));
//		Double value2 = Double.parseDouble(request.getParameter("value2"));
		switch (request.getParameter("oper")) {
		case "Fahrenheit":
			response.getWriter().println("Celcius: " + ((9/5 * value1) + 32));
			break;
		case "Celcius":
			response.getWriter().println("Fahrenheit: " + ((value1 - 32) * 5/9));
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
