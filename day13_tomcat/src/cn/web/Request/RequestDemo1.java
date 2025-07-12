package cn.web.Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        System.out.println("请求方式：" + method);
        String uri=request.getRequestURI();
        System.out.println("请求URI："+uri);
        String contextPath=request.getContextPath();
        System.out.println("项目路径："+contextPath);
        String servletPath=request.getServletPath();
        System.out.println("请求路径："+servletPath);
        String remoteAddr=request.getRemoteAddr();
        System.out.println("请求IP："+remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
