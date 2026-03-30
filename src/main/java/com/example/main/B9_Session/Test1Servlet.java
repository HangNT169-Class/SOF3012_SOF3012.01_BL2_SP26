package com.example.main.B9_Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Test1Servlet", value = "/Test1Servlet")
public class Test1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s = request.getSession();
        // cach goi session => servlet
        String name = (String) s.getAttribute("name1");
        request.setAttribute("name2",name);
        request.getRequestDispatcher("/buoi9/test3.jsp").forward(request,response);
    }
//[
//    {
//
//    }]
//    {
//
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
