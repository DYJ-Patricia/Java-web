package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setCharacterEncoding("UTF-8");
        //response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=response.getWriter();
        pw.write("<h1>你好</h1>");
    }
}
