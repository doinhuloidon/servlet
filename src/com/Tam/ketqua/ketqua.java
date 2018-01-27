package com.Tam.ketqua;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ketqua")
public class ketqua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ketqua() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstnum = request.getParameter("firstnum");
        String secondnum = request.getParameter("secondnum");     
        String plus = request.getParameter("Plus");
        String minus = request.getParameter("Minus");
        String multiple = request.getParameter("Multiple");
        String divide = request.getParameter("Divide");
        
        PrintWriter writer = response.getWriter();

        if(plus != null) {
        	request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        	int number1 = Integer.parseInt(firstnum);
        	int number2 = Integer.parseInt(secondnum);
        	int result = number1 + number2;
            String htmlRespone = "<html>";
            htmlRespone += "<h2>" + result + "</h2>"; 
            htmlRespone += "</html>";
             
            writer.println(htmlRespone);
            }
        
        if(minus != null) {
        	request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        	int number1 = Integer.parseInt(firstnum);
        	int number2 = Integer.parseInt(secondnum);
        	int result = number1 - number2;
            String htmlRespone = "<html>";
            htmlRespone += "<h2>" + result + "</h2>";  
            htmlRespone += "</html>";
             
            writer.println(htmlRespone);
            }
        
        if(multiple != null) {
        	request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        	int number1 = Integer.parseInt(firstnum);
        	int number2 = Integer.parseInt(secondnum);
        	int result = number1 * number2;
            String htmlRespone = "<html>";
            htmlRespone += "<h2>" + result + "</h2>";    
            htmlRespone += "</html>";
             
            writer.println(htmlRespone);
            }
        
        if(divide != null) {
        	request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        	float number1 = Integer.parseInt(firstnum);
        	float number2 = Integer.parseInt(secondnum);
        	float result = number1 / number2;
            String htmlRespone = "<html>";
            htmlRespone += "<h2>" + result + "</h2>";     
            htmlRespone += "</html>";
             
            writer.println(htmlRespone);
            }      
	}

}
