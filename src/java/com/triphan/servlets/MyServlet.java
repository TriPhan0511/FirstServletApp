package com.triphan.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter())
    {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet MyServlet</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
      out.println("<h2>Hello, World!</h2>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
//    processRequest(request, response);
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter())
    {
      String msg = "Welcome to my first servlet application!";
      out.println("<h2>"+ msg+"</h2>");
    }
    
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
//    processRequest(request, response);
  }

  @Override
  public String getServletInfo()
  {
    return "Short description";
  }

}
