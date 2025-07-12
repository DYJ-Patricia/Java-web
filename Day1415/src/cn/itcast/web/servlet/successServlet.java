package cn.itcast.web.servlet;

import cn.itcast.domain.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User use=(User) request.getAttribute("user");
        if(use!=null){
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("登录成功，欢迎你"+use.getUsername());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
