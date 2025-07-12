package cn.web.Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Demo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> a= request.getHeaderNames();
        while (a.hasMoreElements()){
            String name=a.nextElement();
            String val=request.getHeader(name);
            System.out.println(name+"----"+val);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
