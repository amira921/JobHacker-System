package com.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")

public class CalculateAge extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
	    LocalDate age = LocalDate.parse(request.getParameter("age"));
	    
	    Period period = Period.between(dateOfBirth,age);
		int years = period.getYears();
		
		period = period.minusYears(years);
		int months = period.getMonths();
		
		period = period.minusMonths(months);
		int days = period.getDays();
		
		request.setAttribute("years", years);
		request.setAttribute("months",months);
		request.setAttribute("days",days);
	    
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
	}

}
