package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet( "/responseDemo2")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletOutputStream out = response.getOutputStream();
        out.write("你好".getBytes(StandardCharsets.UTF_8));
    }
}
