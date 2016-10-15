package com.EmailServlet;

import com.Email.EmailInfo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmailServlet extends HttpServlet {    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();
        String to = request.getParameter("toAddress");
        String subject = request.getParameter("subject");
        String message = request.getParameter("msg");
        EmailInfo.sendEmail(to, subject, message);
        out.print("Email Sent");
        out.close();
        
    }



}
