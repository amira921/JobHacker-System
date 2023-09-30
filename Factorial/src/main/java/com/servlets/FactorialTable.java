package com.servlets;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/factorial")

public class FactorialTable extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
        PrintWriter out = response.getWriter();
        
        out.print("<style>"
        		+ ".body,table,th,td{border: 1px solid black;}"
        		+ "</style>"
        		+ "<html>"
        		+ "<body>"
        		+"<table>" 
                +"<tr><td>Number</td><td>Factorial</td></tr>"
        		+"<tr><td>0</td><td>1</td></tr>" + '\n');
        
        long factorial = 1;
        
        for(int i=1;i<=10;i++) {
        	factorial *= i;
        	out.println("<tr><td>"+ i + "</td><td>" + factorial + "</td></tr>");
        }
        
        out.print("</table></body></html>");
	}
}
