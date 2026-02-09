package com.irctc;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/trains")
public class TrainServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws IOException {


res.setContentType("text/html");
PrintWriter out = res.getWriter();


out.println("<h2>Available Trains</h2>");
out.println("<ul>");
out.println("<li>12723 - Telangana Express</li>");
out.println("<li>12615 - Grand Trunk Express</li>");
out.println("</ul>");
}
}
